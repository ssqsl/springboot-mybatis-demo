package com.ocean.service;

import com.ocean.dao.UserInfoMapper;
import com.ocean.pojo.UserInfo;
import com.ocean.pojo.UserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserInfoMapper userDao;

    @Override
    public List findAllUser(){
        return  getDataFromDB();
    }

    private List<UserInfo> getDataFromDB(){
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("id desc");
        List<UserInfo> list = userDao.selectByExample(example);
        return list;
    }
}
