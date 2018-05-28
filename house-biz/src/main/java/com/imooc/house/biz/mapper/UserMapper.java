package com.imooc.house.biz.mapper;

import com.imooc.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectUsers();

    Integer insert(User account);

    List<User> selectUsersByQuery(User user);

    Integer delete(String email);

    Integer update(User updateUser);
}
