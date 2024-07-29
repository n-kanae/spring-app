package com.adconnect.webapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adconnect.webapp.entity.User;
import com.adconnect.webapp.repository.UserMapper;
import com.adconnect.webapp.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    /** DI */
    private final UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public User findByIdUser(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.update(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.delete(id);
    }
}
