package com.breeze.devop.suser.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author breeze
 * @date 2020/7/21
 */
@Data
@ApiModel("用户实体类")
public class UserEntity {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;
}
