package com.cqc.backend.service;

import com.cqc.backend.model.News;
import com.cqc.backend.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:Junqson
 * create:2018/4/14 20:25
 * des:
 */
@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;

    public void addNews(News news) {
        newsRepository.save(news);
    }
}
