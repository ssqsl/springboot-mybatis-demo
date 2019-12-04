package com.ocean.service;

import com.ocean.pojo.UserInfo;

import java.util.List;

public interface IUserService {
    List<UserInfo> findAllUser();
}
