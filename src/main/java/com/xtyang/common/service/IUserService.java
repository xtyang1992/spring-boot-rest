package com.xtyang.common.service;

import com.xtyang.common.model.User;

import java.util.List;

/**
 * Created by wuzhiyu on 16-1-10.
 */
public interface IUserService {
    List<User> list();
    User show(int id);
    void add(User u);
    void update(User u);
    void destory(int id);
}
