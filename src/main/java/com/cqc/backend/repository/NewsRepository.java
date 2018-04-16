package com.cqc.backend.repository;

import com.cqc.backend.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author:Junqson
 * create:2018/4/14 21:03
 * des:
 */
@Repository
public interface NewsRepository extends JpaRepository<News,Integer>{

    News findOneByTitle(String title);
    List<News> findAllByType(String type);
    News findOneById(Integer id);
    //deleteById已经实现

}
