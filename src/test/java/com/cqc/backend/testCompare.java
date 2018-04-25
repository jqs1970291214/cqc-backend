package com.cqc.backend;

import com.cqc.backend.model.News;

import java.lang.reflect.Array;
import java.util.*;

/**
 * author:Junqson
 * create:2018/4/23 13:45
 * des:
 */
public class testCompare {
    public static void main(String[] args) {
        News news = new News();
        News news2 = new News();
        News news3 = new News();

        news.setId(0);
        news2.setId(1);
        news3.setId(2);

        news.setTime("04-01");
        news2.setTime("04-10");
        news3.setTime("03-25");
        /*
        System.out.println(news.compareTo(news2));
*/


        ArrayList<News> newsList = new ArrayList<>();

        newsList.add(news);
        newsList.add(news2);
        newsList.add(news3);



        Collections.sort(newsList);

        for (News newss : newsList) {
            System.out.println(newss.getTime());
        }

    }

}
