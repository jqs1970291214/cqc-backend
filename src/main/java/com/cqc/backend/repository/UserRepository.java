package com.cqc.backend.repository;

import com.cqc.backend.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author:Junqson
 * create:2018/4/14 0:50
 * des:
 */
public interface UserRepository extends JpaRepository<UserInfo,String> {
    UserInfo findOneByUsername(String username);
}
