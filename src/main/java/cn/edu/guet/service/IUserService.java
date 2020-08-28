package cn.edu.guet.service;

import cn.edu.guet.model.User;

public interface IUserService {
    User login(String username, String password);
    User viewUserById(String userId);
    void updateUser(User user) throws Exception;
}
