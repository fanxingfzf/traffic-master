package com.msb.system.web;

import com.msb.api.commons.ResponseResult;
import com.msb.api.commons.ResponseResultFactory;
import com.msb.api.commons.SystemUtils;
import com.msb.system.entity.UserEntity;
import com.msb.system.info.UserInfo;
import com.msb.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    public ResponseResult addUser(UserEntity userEntity){

        if(SystemUtils.isNUll(userEntity)){
            
        }

        ResponseResult responseResult = ResponseResultFactory.buildResponseResult();


        return responseResult;
    }
}
