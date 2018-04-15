package com.cqc.backend.repository;

import com.cqc.backend.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * author:Junqson
 * create:2018/4/14 21:03
 * des:
 */
@Repository
public interface NewsRepository extends JpaRepository<News,Integer>{

}
