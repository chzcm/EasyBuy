package com.wzf.dao;

import com.wzf.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsDao {

    List<News> getNews(@Param("start") int start,@Param("number") int number);
}
