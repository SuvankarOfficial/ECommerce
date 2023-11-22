package com.ecommerce.user.service;

import com.ecommerce.user.entity.User;

import java.util.List;

public interface UserService {

    public User findById(String userUniqueId);

    public List<User> findAll();

    public User save(User user);

    public User update(User user);

    public Boolean delete(String userUniqueId);

}
