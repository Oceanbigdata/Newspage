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
    public List<News> getNewsList(int pageIndex,int pageSize) {
        int offset = (pageIndex-1)*pageSize;
        return newsDao.queryAll(offset,pageSize);
    }

    @Override
    public int getTotalPages(int pageSize) {
        int newsNumber = newsDao.countNews();
        return (newsNumber%pageSize==0)?(newsNumber/pageSize):(newsNumber/pageSize+1);
    }
}
