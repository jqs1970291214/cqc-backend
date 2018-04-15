package com.cqc.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * author:Junqson
 * create:2018/4/14 20:00
 * des: 新闻实体类
 */
@Entity
@Table(name = "news")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class News implements Serializable{
    @Id @GeneratedValue
    private Integer id;
    private String title;
    private String type;
    private String content;

}
