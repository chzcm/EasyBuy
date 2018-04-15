package com.wzf.service.serviceImpl;

import com.wzf.dao.NewsDao;
import com.wzf.entity.News;
import com.wzf.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsDao newsDao;

    public List<News> getNews(int currentPage, int perNumber) {
        return newsDao.getNews((currentPage-1)*perNumber,perNumber);
    }


    public void setNewsDao(NewsDao newsDao) {
        this.newsDao = newsDao;
    }
}
