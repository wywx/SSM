package com.jjzy.service;

import com.jjzy.dao.UserDao;
import com.jjzy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Author wj
 * @Date 2019/10/27 14:37
 * Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<User> selectAll() {
        List<User> list = userDao.selectAll();
        return list;
    }

    /**
     * 查询一个
     * @param id
     * @return
     */
    @Override
    public User selectOne(Integer id) {
        return userDao.selectOne(id);
    }

    /**
     * 条件查询
     * @return
     */
    @Override
    public List<User> selectByName(User user) {
        return userDao.selectByName(user);
    }

    /**
     * 添加用户
     * @param user
     */
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    /**
     * 升级用户
     * @param user
     */

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    public void deletedUser(Integer id) {
        userDao.deletedUser(id);
    }
}
