package com.cqc.backend.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * author:Junqson
 * create:2018/4/13 23:39
 * des: 用户信息实体类
 */
@Entity
@Table(name = "t_userinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable{
    @Id
    private String username;
    private String password;


}
