package com.ecommerce.user.service.implementation;


import com.ecommerce.user.entity.User;
import com.ecommerce.user.exception.DoesNotExist;
import com.ecommerce.user.repository.UserRepository;
import com.ecommerce.user.exception.InvalidUserIdException;
import com.ecommerce.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(String userUniqueId){
        if(userUniqueId.isBlank())
            throw new InvalidUserIdException("Please Enter Proper User Id");
        User user = this.userRepository.findByUserUniqueId(userUniqueId);
        return user;
    }

    public List<User> findAll(){
        List<User> users = this.userRepository.findAll();
        return users;
    }

    public User save(User user){
        user.setUserUniqueId(String.valueOf(UUID.randomUUID()));
        User savedUser = this.userRepository.save(user);
        return savedUser;
    }

    public User update(User user){
        if(this.findById(user.getUserUniqueId())== null)
            throw new DoesNotExist("User");
        User savedUser = this.userRepository.save(user);
        return savedUser;
    }

    public Boolean delete(String userUniqueId){
        User savedUser = this.findById(userUniqueId);
        savedUser.setDeleted(Boolean.TRUE);
        User updateUser = this.update(savedUser);
        return Boolean.TRUE;
    }
}
