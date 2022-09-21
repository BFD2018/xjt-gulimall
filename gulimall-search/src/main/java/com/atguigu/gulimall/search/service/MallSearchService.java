package com.atguigu.gulimall.search.service;

import com.atguigu.gulimall.search.vo.SearchParam;

import javax.naming.directory.SearchResult;

public interface MallSearchService {
    SearchResult search(SearchParam param);
}
