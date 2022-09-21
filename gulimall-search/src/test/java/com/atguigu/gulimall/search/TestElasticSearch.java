package com.atguigu.gulimall.search;

import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SuppressWarnings({})
@SpringBootTest
public class TestElasticSearch {
    @Autowired
    RestHighLevelClient client;

    /**
     * 检索地址中带有 mill 的人员年龄分布和平均薪资
     */
    @Test
    public void testSearch(){

    }
}
