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
     * 获取审核通过的新闻列表
     * @return
     */
    List<News> getNewsList(int pageIndex,int pageSize);

    /**
     * 获取分页总页数
     * @return
     */
    int getTotalPages(int pageSize);

    /**
     * 添加新闻
     */

    String addNews(News news);

    /**
     * 查询待审核的新闻
     * @return
     */
    List<News> getNewsPass();

    /**
     * 修改新闻状态
     * @param newsId
     * @param publishStatus
     * @return
     */
    int updateStatus(Long newsId,char publishStatus);

}
