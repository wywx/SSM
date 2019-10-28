package com.jjzy.service;
import com.jjzy.pojo.User;
import java.util.List;

/**
 * @Author wj
 * @Date 2019/10/27 14:36
 * Version 1.0
 */
public interface UserService {
    List<User> selectAll();
    User selectOne(Integer id);
    List<User> selectByName(User user);
    void addUser(User user);
    void updateUser(User user);
    void deletedUser(Integer id);

}
