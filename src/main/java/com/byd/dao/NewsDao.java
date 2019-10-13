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

}
