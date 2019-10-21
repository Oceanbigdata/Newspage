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
        List<News> newsList = newsDao.queryAll(0, 5);
        for (News news : newsList){
            System.out.println(news);
        }
    }

    @Test
    public void testCountNews() throws Exception{
        int countPage = newsDao.countNews();
        System.out.println(countPage);
    }

    @Test
    public void testAddNews() throws Exception{
        News news = new News();
        news.setNewsAuthor("张三");
        news.setNewsContent("<p><br></p>");
        news.setNewsDate("2019/10/20");
        news.setNewsTitle("标题");
        news.setPublishStatus('0');
        int result = newsDao.addNews(news);
        System.out.println(result);

    }

    @Test
    public void testUpdateStatus() throws Exception{

        int countPage = newsDao.updateStatus((long)11,'1');
        System.out.println(countPage);
    }

}
