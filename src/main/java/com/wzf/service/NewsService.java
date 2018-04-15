package com.wzf.service;

import com.wzf.entity.News;

import java.util.List;

public interface NewsService {
    List<News> getNews(int currentPage, int perNumber);
}
