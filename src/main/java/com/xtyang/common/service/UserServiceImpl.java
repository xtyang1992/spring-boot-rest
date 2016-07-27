package com.xtyang.common.service;

import com.xtyang.common.mapper.UserMapper;
import com.xtyang.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wuzhiyu on 16-1-10.
 */

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> list() {
        List<User> users = mapper.getAllPeronInfo();
        return users;
    }

    @Override
    public User show(int id) {
        return this.mapper.getPersonInfo(id);
    }

    @Override
    public void add(User p) {

    }

    @Override
    public void update(User p) {

    }

    @Override
    public void destory(int id) {

    }
}
