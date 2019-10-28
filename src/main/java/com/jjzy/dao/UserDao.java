package com.jjzy.dao;
import com.jjzy.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author wj
 * @Date 2019/10/27 17:01
 * Version 1.0
 * 简单点的用注解复杂一点的使用xml
 */
@Repository
public interface UserDao {
   @Select("select * from user")
    List<User> selectAll();

   @Select("select * from user where id=#{id}")
   User selectOne(Integer id);

   List<User> selectByName(User user);

   @Update("update user set username=#{username},password=#{password},sex=#{sex} where id =#{id}")
   void updateUser(User user);

   @Insert("insert into user(id,username,password,email,phone,sex) values(#{id},#{username},#{password},#{email},#{phone},#{sex})")
   void addUser(User user);

   @Delete("delete from user where id=#{id}")
   void deletedUser(Integer id);

}
