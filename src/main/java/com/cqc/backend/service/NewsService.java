package com.cqc.backend.service;

import com.cqc.backend.exception.MyException;
import com.cqc.backend.model.News;
import com.cqc.backend.repository.NewsRepository;
import com.cqc.backend.util.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:Junqson
 * create:2018/4/14 20:25
 * des:
 */
@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;

    public News getNewsById(Integer id) {
        News news = newsRepository.findOneById(id);
        if (news != null) {
            return news;
        } else {
            throw new MyException(ResultEnum.NOT_FOUND);
        }
    }

    public List<News> getNewsListByType(String type) {
        List<News> newsList = newsRepository.findAllByType(type);
        return newsList;
    }

    public News deleteByTitle(String title){
        News news =  newsRepository.findOneByTitle(title);
        if (news != null) {
            newsRepository.deleteById(news.getId());
            return news;
        } else {
            throw new MyException(ResultEnum.NOT_FOUND);
        }
    }


    public News getNewsByTitle(String title){
        News news = newsRepository.findOneByTitle(title);
        if (news != null) {
            return news;
        } else {
            throw new MyException(ResultEnum.NOT_FOUND);
        }

    }


    public void addNews(News news) {
        News ano = newsRepository.findOneByTitle(news.getTitle());
        if (ano != null && news.getTitle().equals(ano.getTitle())) {
            throw new MyException(ResultEnum.RECORD_EXISTS);
        } else {
            newsRepository.save(news);
        }
    }
}
