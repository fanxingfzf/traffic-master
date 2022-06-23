package com.msb.system.service;

import com.msb.api.commons.SystemUtils;
import com.msb.system.info.UserInfo;
import com.msb.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {

    public boolean addUser(UserInfo userInfo);
}
