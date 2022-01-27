package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    public User getUserById(Integer id);

    @Update("update user set first_name=#{firstName} where id=#{id}")
    int updateUser(User user);
}
