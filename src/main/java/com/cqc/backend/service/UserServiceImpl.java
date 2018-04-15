package com.cqc.backend.service;

import com.cqc.backend.model.UserInfo;
import com.cqc.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * author:Junqson
 * create:2018/4/13 23:55
 * des:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    public UserInfo createNewAccount(String user, String pwd) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(user);
        userInfo.setPassword(pwd);
        // 调用持久层，完成数据的保存
        return userRepository.save(userInfo);
    }

    public UserInfo getUser(String user){
        UserInfo userInfo = userRepository.findOneByUsername(user);
        return userInfo;
    }
}
