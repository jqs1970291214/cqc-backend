package com.cqc.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * author:Junqson
 * create:2018/4/14 20:00
 * des: 信息实体类
 */
@Entity
@Table(name = "news")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class News{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String title;
    private String time;
    private String type;
    private String cover;
    private String content;

    /**
     *无content构造方法
     */
    public News(Integer id,String title,String time,String type,String cover){
        this.id = id;
        this.title = title;
        this.time = time;
        this.type = type;
        this.cover = cover;
        this.content = "";
    }

}
