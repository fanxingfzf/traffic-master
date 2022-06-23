package com.msb.api.code;

/**
 * 系统管理模块的错误码
 * 区间：10000-15555
 */
public interface SystemCode {

    //系统通用的成功状态码
    String TRAFFIC_SYSTEM_SUCCESS="000000";
    String TRAFFIC_SYSTEM_ERROR="000001";
    /**
     * 错误 提示 警告
     */
    //用户管理       10000 - 10999
    //10000-10499错误提示
    int SYSTEM_USER_ERROR_ADD_FAIL = 10000;
    //10500-10999 成功的提示
    int SYSTEM_USER_INFO_ADD = 10000;

    //角色管理 11000 - 11999
    int SYSTEM_ROLE_ERROR_ADD_FAIL = 11000;

    //权限管理 12000 - 12999
}
