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

import java.util.List;

/**
 * Created by Ocean on 2019/10/12.
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    private String list(Model model){
        List<News> newsList = newsService.getNewsList();

        model.addAttribute("list",newsList);
        return "newslist";
    }

    @RequestMapping(value = "/{newsId}/detail",method = RequestMethod.GET)
    private String detail(@PathVariable("newsId") Long newsId, Model model) {
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
