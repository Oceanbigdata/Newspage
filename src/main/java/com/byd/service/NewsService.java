package com.byd.service;

import com.byd.entity.News;

import java.util.List;

/**
 *
 */
public interface NewsService {

    /**
     * 根据id获取新闻
     * @param newsId
     * @return
     */
    News getNewsById(Long newsId);

    /**
     * 获取新闻列表
     * @return
     */
    List<News> getNewsList(int pageIndex,int pageSize);

    /**
     * 获取分页总页数
     * @return
     */
    int getTotalPages(int pageSize);

}
