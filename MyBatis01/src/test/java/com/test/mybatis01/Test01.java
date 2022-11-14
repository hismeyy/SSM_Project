package com.test.mybatis01;

import com.Mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    @Test
    public void insertTest() throws IOException {
        // 读取Mybatis的核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建sqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 通过核心配置文件所对应的字节输入流创建SqlSessionFactory，产生SqlSession对象
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession(true);
        // 通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签
        // 并执行标签中的SQL语句
        int result = userMapper.insertUser();
        //  sqlSession.commit();
        System.out.println("结果" + result);
        sqlSession.close();

    }
}
