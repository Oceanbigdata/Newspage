package com.byd.dao;

import com.byd.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 新闻dao接口
 */
public interface NewsDao {

    /**
     * 根据id获取新闻
     * @param newsId
     * @return
     */
    News queryById(Long newsId);

    /**
     * 获取所有新闻列表
     * @param offset    起始位置
     * @param limit     数量
     * @return
     */
    List<News> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 计算总新闻数量
     * @return
     */
    int countNews();

    /**
     * 插入新闻
     */
    int addNews(News news);

    /**
     * 查询待审核的新闻
     * @return
     */
    List<News> queryNewsReview();

    /**
     * 修改新闻状态
     * 1是通过，2是拒绝
     * @param newsId
     * @return
     */
    int updateStatus(@Param("newsId") Long newsId,@Param("publishStatus") char publishStatus);



}
