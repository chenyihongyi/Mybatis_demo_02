package com.springboot_mybatis.mybatis_demo_02.demo;

import com.springboot_mybatis.mybatis_demo_02.annotation.UserMapper;
import com.springboot_mybatis.mybatis_demo_02.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.EncodedResource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/12 20:44
 */
public class MybBatisAnnotationConfigurationDemo {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("mybatis/mybatis-config.xml");
       Reader reader = new InputStreamReader(inputStream, "UTF-8");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(reader, "dev", new Properties());
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUser(9);
        System.out.println(user);
        sqlSession.close();
    }
}
