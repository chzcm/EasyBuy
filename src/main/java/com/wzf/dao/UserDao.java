package com.wzf.dao;

import com.wzf.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User login(@Param("loginName") String loginName,@Param("password") String password);
//    void userAdd(@Param("loginName") String loginName,@Param("userName") String userName,@Param("passsword") String passsword,@Param("sex") int sex,
//                 @Param("identityCode") String identityCode,@Param("email") String email,@Param("mobile") String mobile,@Param("type") String type);
    void userAdd(@Param("user") User user);
}
