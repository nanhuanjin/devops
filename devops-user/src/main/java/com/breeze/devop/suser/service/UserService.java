package com.breeze.devop.suser.service;

import com.breeze.devop.suser.entity.UserEntity;

/**
 * @author breeze
 * @date 2020/7/21
 */
public interface UserService {

    UserEntity login(UserEntity userEntity);
}
