package com.test.demo.dao;

import com.test.demo.model.User;

import java.util.List;

/**
 * Created by ritter on 16-10-17.
 */

public interface UserMapper {
    User getUserById(int id);

    List findAllUsers();
}
