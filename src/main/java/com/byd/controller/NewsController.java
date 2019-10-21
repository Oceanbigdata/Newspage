package com.byd.controller;

import com.byd.entity.News;
import com.byd.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/news")
public class NewsController {
    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    private String list(Model model,HttpServletRequest request){
        String pageIndex = request.getParameter("pageIndex");
        int totalPages = newsService.getTotalPages(5);
        if (pageIndex==null){
            pageIndex="1";
        }
        int currentPageIndex = Integer.parseInt(pageIndex);
        if(currentPageIndex<1){
            currentPageIndex=1;
        }else if(currentPageIndex>=totalPages){
            currentPageIndex=totalPages;
        }

        List<News> newsList = newsService.getNewsList(currentPageIndex,5);

        model.addAttribute("list",newsList);
        model.addAttribute("pages",totalPages);
        model.addAttribute("pageIndex",currentPageIndex);

        return "newslist";
    }



    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    private String detail(Model model,HttpServletRequest request) {
        Long newsId = Long.parseLong(request.getParameter("newsId"));
        if (newsId == null) {
            return "redirect:/news/list";
        }


        News news = newsService.getNewsById(newsId);
        if (news == null) {
            return "forward:/news/list";
        }

        model.addAttribute("news", news);
        return "detail";
    }

}
