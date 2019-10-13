package com.byd.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 新闻实体类
 */
public class News {
    private Long newsId;//新闻id
    private String newsTitle;//新闻标题
    private String newsContent;//新闻内容
    private String newsAuthor;//新闻作者
    private String newsImgPath;//图片路径
    private String newsDate;//新闻日期
    private char publishStatus;//发布状态 0发布，1未发布

    public News() {
    }

    public News(Long newsId, String newsTitle, String newsContent, String newsAuthor, String newsImgPath, String newsDate, char publishStatus) {
        this.newsId = newsId;
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
        this.newsAuthor = newsAuthor;
        this.newsImgPath = newsImgPath;
        this.newsDate = newsDate;
        this.publishStatus = publishStatus;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    public String getNewsImgPath() {
        return newsImgPath;
    }

    public void setNewsImgPath(String newsImgPath) {
        this.newsImgPath = newsImgPath;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }

    public char getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(char publishStatus) {
        this.publishStatus = publishStatus;
    }

    @Override
    public String toString() {
        return "News{" +
            "newsId=" + newsId +
            ", newsTitle='" + newsTitle + '\'' +
            ", newsContent='" + newsContent + '\'' +
            ", newsAuthor='" + newsAuthor + '\'' +
            ", newsImgPath='" + newsImgPath + '\'' +
            ", newsDate=" + newsDate +
            ", publishStatus=" + publishStatus +
            '}';
    }
}
