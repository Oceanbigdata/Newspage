package com.byd.dao;

import com.byd.BaseTest;
import com.byd.entity.News;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class NewsDaoTest extends BaseTest {
    @Autowired
    private NewsDao newsDao;

    @Test
    public void testQueryById() throws Exception {
        long bookId = 1;
        News news = newsDao.queryById(bookId);
        System.out.println(news);
    }
    @Test
    public void testQueryAll() throws Exception{
        List<News> newsList = newsDao.queryAll(0, 10);
        for (News news : newsList){
            System.out.println(news);
        }
    }

}
