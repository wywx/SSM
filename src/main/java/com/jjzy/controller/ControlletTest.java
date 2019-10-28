package com.jjzy.controller;

import com.jjzy.pojo.User;
import com.jjzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * @Author wj
 * @Date 2019/10/27 14:57
 * Version 1.0
 */
@RestController
public class ControlletTest {
    @Autowired
    UserService userService;

    @GetMapping("select")
    public List<User> select(){
        List<User> list = userService.selectAll();
        return list;
    }

    @PostMapping("selectByname")
    public List<User> selectByname(@RequestBody User user){
        List<User> list = userService.selectByName(user);
        return list;
    }

    @PostMapping("selectid")
    public User selectByname(@RequestBody Integer id){
        User user1 = userService.selectOne(id);
        System.out.println(user1);
        return user1;
    }


    @PostMapping("adduser")
    public void addUser(@Valid @RequestBody User user){
        userService.addUser(user);
    }

    @PostMapping("delete")
    public void deleted(@RequestBody Integer id){
        userService.deletedUser(id);
    }

    @PostMapping("alertUser")
    public void alertUser(@Valid @RequestBody User user){
        userService.addUser(user);
    }

}
