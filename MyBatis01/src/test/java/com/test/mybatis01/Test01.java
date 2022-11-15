package com.test.mybatis01;

import com.Mybatis.mapper.UserMapper;
import com.Mybatis.pojo.User;
import com.Mybatis.utils.GetSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Test01 {
    @Test
    public void insertTest(){
        SqlSession sqlSession = GetSqlSession.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.insertUser();
        System.out.println("结果" + result);
        sqlSession.close();
    }

    @Test
    public void updateTest(){
        SqlSession sqlSession = GetSqlSession.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.updateUser();
        System.out.println("结果" + result);
        sqlSession.close();
    }

    @Test
    public void deleteTest(){
        SqlSession sqlSession = GetSqlSession.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.deleteUser();
        System.out.println("结果" + result);
        sqlSession.close();
    }

    @Test
    public void selectUserByIdTest(){
        SqlSession sqlSession = GetSqlSession.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUserById(3);
        System.out.println("结果" + user);
        sqlSession.close();
    }

    @Test
    public void selectUserListTest(){
        SqlSession sqlSession = GetSqlSession.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUserList();
        users.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void selectUserCountTest(){
        SqlSession sqlSession = GetSqlSession.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int i = userMapper.selectUserCount();
        System.out.println("结果" + i);
        sqlSession.close();
    }

    @Test
    public void selectUserToMapsTest(){
        SqlSession sqlSession = GetSqlSession.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> maps = userMapper.selectUserToMaps();
        System.out.println("结果" + maps);
        sqlSession.close();
    }

    @Test
    public void selectUserToListTest(){
        SqlSession sqlSession = GetSqlSession.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> maps = userMapper.selectUserToList();
        System.out.println("结果" + maps);
        sqlSession.close();
    }

    @Test
    public void selectUserToMapTest(){
        SqlSession sqlSession = GetSqlSession.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> maps = userMapper.selectUserToList();
        System.out.println("结果" + maps);
        sqlSession.close();
    }

}
