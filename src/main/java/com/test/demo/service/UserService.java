package com.test.demo.service;

import com.test.demo.dao.UserMapper;
import com.test.demo.model.User;
import com.test.demo.util.JDBCUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by ritter on 16-10-17.
 */
public class UserService {

    public List findAllUsers() {
        SqlSession session = JDBCUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List users = userMapper.findAllUsers();

        JDBCUtil.colseSession(session);
        return users;
    }

    public User getUserById(Integer id) {
        SqlSession session = JDBCUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.getUserById(id);
        JDBCUtil.colseSession(session);
        return user;
    }

}