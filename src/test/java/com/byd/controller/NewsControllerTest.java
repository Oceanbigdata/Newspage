package com.byd.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;



@RunWith(SpringJUnit4ClassRunner.class)
// 配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class NewsControllerTest extends AbstractContextControllerTests{
    private MockMvc mockMvc;
    private String listUrl = "/news/list";
    private String detailUrl = "/news/{newsId}/detail";
    private long newsId = 1;

    @Before
    public void setup() {
        //初始化mockMVC对象
        //判断状态是否ok，总是打印结果
        this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).alwaysDo(print()).build();
    }

    @Test
    public void list() throws Exception {
        //添加get请求的url
        //添加验证断言来判断执行请求后的结果是否是预期的
        this.mockMvc.perform(get(listUrl)).andExpect(view().name("newslist"));
    }

    @Test
    public void existDetail() throws Exception {
        //添加get请求的url、参数，添加跳转页面，添加返回前端的数据
        this.mockMvc.perform(get(detailUrl, newsId)).andExpect(view().name("detail"))
            .andExpect(model().attributeExists("news"));
    }

    @Test
    public void notExistDetail() throws Exception {
        this.mockMvc.perform(get(detailUrl, 1100)).andExpect(forwardedUrl("/news/list"));
    }

}
