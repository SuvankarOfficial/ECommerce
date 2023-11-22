package com.ecommerce.user.controller;

import com.ecommerce.user.bean.ResponseService;
import com.ecommerce.user.entity.User;
import com.ecommerce.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/by-id/{id}")
    public ResponseService findById(@PathVariable("id") String userUniqueId){
        User user = this.userService.findById(userUniqueId);
        return ResponseService.builder().status(Boolean.TRUE).data(user).build();
    }

    @GetMapping("/all")
    public ResponseService findAll(){
        List<User> users = this.userService.findAll();
        return ResponseService.builder().status(Boolean.TRUE).data(users).build();
    }

    @PostMapping("/save")
    public ResponseService save(@RequestBody User user){
        User savedUser = this.userService.save(user);
        return ResponseService.builder().status(Boolean.TRUE).data(savedUser).build();
    }

    @PutMapping("/update")
    public ResponseService update(@RequestBody User user){
        User savedUser = this.userService.update(user);
        return ResponseService.builder().status(Boolean.TRUE).data(savedUser).build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseService delete(@PathVariable("id") String userUniqueId){
        Boolean delete = this.userService.delete(userUniqueId);
        return ResponseService.builder().status(Boolean.TRUE).data(delete).build();
    }
}
