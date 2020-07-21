package com.breeze.devop.suser.service.impl;

import com.breeze.devop.suser.entity.UserEntity;
import com.breeze.devop.suser.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author breeze
 * @date 2020/7/21
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login(UserEntity userEntity) {
        return null;
    }
}
