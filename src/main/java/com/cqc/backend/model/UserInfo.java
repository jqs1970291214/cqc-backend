package com.cqc.backend.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * author:Junqson
 * create:2018/4/13 23:39
 * des:
 */
@Entity
@Table(name = "t_userinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    @Id
    private String username;
    private String password;


}
