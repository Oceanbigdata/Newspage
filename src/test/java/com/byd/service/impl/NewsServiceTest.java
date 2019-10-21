package com.byd.service.impl;

import com.byd.BaseTest;
import com.byd.entity.News;
import com.byd.service.NewsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Ocean on 2019/10/12.
 */
public class NewsServiceTest extends BaseTest {

    @Autowired
    private NewsService newsService;

    @Test
    public void testGetNewsById() throws Exception{
        News news = newsService.getNewsById((long) 1);
        System.out.println(news);

    }

    @Test
    public void testGetNewsList() throws Exception{
        List<News> newsList = newsService.getNewsPass();
        for (News news : newsList){
            System.out.println(news);
        }

    }

    @Test
    public void testGetTotalPages() throws Exception{
        int totalPages = newsService.getTotalPages(5);
        System.out.println(totalPages);
    }
}
