package com.Mybatis.mapper;

import com.Mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UserMapper {

    int insertUser();

    int updateUser();

    int deleteUser();

    User selectUserById(@Param("id") Integer id);

    List<User> selectUserList();

    int selectUserCount();

    Map<String, Object> selectUserToMap(@Param("id") int id);

    List<Map<String, Object>> selectUserToList();

    @MapKey("id")
    Map<String, Object> selectUserToMaps();

}
