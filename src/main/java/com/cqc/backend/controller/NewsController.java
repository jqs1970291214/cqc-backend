package com.cqc.backend.controller;

import com.cqc.backend.model.News;
import com.cqc.backend.service.NewsService;
import com.cqc.backend.viewmodel.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.lang3.StringUtils;
/**
 * author:Junqson
 * create:2018/4/14 19:34
 * des:
 */
@RestController
public class NewsController {

    @Autowired
    NewsService newsService;


    @RequestMapping(value = "/addnews",method = RequestMethod.POST)
    public ApiResult addNews(@RequestParam("title") String title,@RequestParam("type") String type,
                             @RequestParam("content") String content) {
        if(StringUtils.isEmpty(title) && StringUtils.isEmpty(type)) {
            return new ApiResult(404,"title or type is empty!");
        }
        News news = new News();
        news.setTitle(title);
        news.setType(type);
        news.setContent(content);
        newsService.addNews(news);
        return ApiResult.ok();
    }


   /* public ApiResult deleteNews() {

    }

    public ApiResult getNewsList(){

    }*/


}
