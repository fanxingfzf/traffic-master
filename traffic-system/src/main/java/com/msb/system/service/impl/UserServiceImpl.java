package com.msb.system.service.impl;

import com.msb.api.commons.SystemUtils;
import com.msb.system.info.UserInfo;
import com.msb.system.repository.UserRepository;
import com.msb.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    final int ZERO=0;

    @Autowired
    UserRepository userRepository;

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    public boolean addUser(UserInfo userInfo){

        UserInfo user = userRepository.save(userInfo);

        if(!SystemUtils.isNUll(user)&&user.getUid()!=ZERO){
            return true;
        }
        return false;
    }

}
