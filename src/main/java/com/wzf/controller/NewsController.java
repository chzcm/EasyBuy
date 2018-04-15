package com.wzf.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wzf.entity.News;
import com.wzf.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/list",produces="text/html;charset=UTF-8")
    @ResponseBody
    public  String getNews(int currentPage, int perNumber){
        List<News> list =  newsService.getNews(currentPage,perNumber);
        String str = "";
        for(int i=0;i<list.size();i++){
            str += list.get(i).toString();
        }
        return str;
    }



    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }
}
