package com.xiyou3g.xiyouhelper.dao;

import com.xiyou3g.xiyouhelper.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}