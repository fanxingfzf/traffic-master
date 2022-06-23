package com.msb.system.repository;

import com.msb.system.info.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 我们负责数据查询的接口
 */
public interface UserRepository extends JpaRepository<UserInfo,Long> {
}
