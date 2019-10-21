package com.byd.controller;

import com.byd.entity.News;
import com.byd.entity.User;
import com.byd.service.NewsService;
import com.byd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private UserService userService;

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private String login(Model model, HttpServletRequest request,HttpSession session) {
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
        if (user.getUsername().equals(username)&&user.getRole()=='1') {
            session.setAttribute("username",username);
            return "redirect:/review/list";
        }else {
            return "redirect:/news/list";
        }

    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    private String list(Model model, HttpServletRequest request){

        List<News> newsList = newsService.getNewsPass();

        for (News news : newsList){
            System.out.println(news);
        }

        model.addAttribute("list",newsList);

        return "review";
    }

    @RequestMapping(value = "/yes",method = RequestMethod.GET)
    private String yes(Model model, HttpServletRequest request){
        String newsId = request.getParameter("newsId");
        int result = newsService.updateStatus(Long.parseLong(newsId), '1');
        return "redirect:/review/list";
    }

    @RequestMapping(value = "/no",method = RequestMethod.GET)
    private String no(Model model, HttpServletRequest request){
        String newsId = request.getParameter("newsId");
        int result = newsService.updateStatus(Long.parseLong(newsId), '2');
        return "redirect:/review/list";
    }

}
