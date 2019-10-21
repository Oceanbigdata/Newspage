package com.byd.controller;

import com.byd.entity.News;
import com.byd.entity.User;
import com.byd.service.NewsService;
import com.byd.service.UserService;

import com.byd.util.EditorResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;


@Controller
@RequestMapping("/editor")
public class EditorController {
    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Autowired
    private NewsService newsService;




    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private String list(Model model, HttpServletRequest request) {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username == "" || password == "") {
            return "redirect:/news/list";
        }
        int number = Integer.parseInt(password);

        User user = userService.getUserById(number);
        if (user.getUsername().equals(username)) {
            model.addAttribute("user",user);
            return "editor";
        }else {
            return "redirect:/news/list";
        }

        }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    private String submit(Model model, HttpServletRequest request) {

        String content = request.getParameter("data");
        String newsAuthor = request.getParameter("newsAuthor");
        String newsTitle = request.getParameter("newsTitle");
        String newsDate = request.getParameter("date");

        News news = new News();
        news.setNewsTitle(newsTitle);
        news.setNewsDate(newsDate);
        news.setNewsAuthor(newsAuthor);
        news.setNewsContent(content);

        String result = newsService.addNews(news);
        System.out.println("-----------新闻编辑-----------");
        System.out.println(result);

        if (result=="error"){
            return "{\"result\":\"error\"}";
        }else {
            return "{\"result\":\"success\"}";
        }

    }

    @RequestMapping(value = "/upload")
    @ResponseBody
    public EditorResult upload(MultipartFile upimg, HttpServletRequest request){
        EditorResult er = new EditorResult();
        er.setErrno(1);
        String basepath = request.getServletContext().getRealPath("/resources/uploadimg");
        String imgname = UUID.randomUUID().toString();
        String suffix = upimg.getOriginalFilename().substring(upimg.getOriginalFilename().lastIndexOf("."));
        try {
            upimg.transferTo(new File(basepath+"/"+imgname+suffix));
            er.setErrno(0);
            er.setData(new String[]{"/resources/uploadimg/"+imgname+suffix});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return er;
    }



}

