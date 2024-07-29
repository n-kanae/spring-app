package com.adconnect.webapp.service;

import java.util.List;

import com.adconnect.webapp.entity.User;

public interface UserService {

    List<User> findAllUser();

    User findByIdUser(Integer id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);
}
