package com.springboot_mybatis.mybatis_demo_02.annotation;

import com.springboot_mybatis.mybatis_demo_02.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/12 20:23
 */
@Mapper
public interface UserMapper {


    @Results(value={
            @Result(property="id", column = "id", id = true),
            @Result(property="name", column = "name"),
            @Result(property="age", column = "age"),
            @Result(property="description", column = "desc"),
            @Result(property="height", column = "height")
    })
    @Select("SELECT id, name, age, 'desc', height FROM user WHERE id = #{id}")
    User selectUser(int id);

}
