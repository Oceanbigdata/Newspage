package com.byd.service.impl;

import com.byd.dao.NewsDao;
import com.byd.entity.News;
import com.byd.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NewsDao newsDao;

    @Override
    public News getNewsById(Long newsId) {
        return newsDao.queryById(newsId);
    }

    @Override
    public List<News> getNewsList() {
        return newsDao.queryAll(0,10);
    }
}
