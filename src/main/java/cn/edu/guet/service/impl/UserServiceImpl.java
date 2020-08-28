package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.UserMapper;
import cn.edu.guet.model.User;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User viewUserById(String userId) {
        return userMapper.viewUserById(userId);
    }

    @Override
    public void updateUser(User user) throws Exception{
        userMapper.updateUser(user);

    }

    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }




}