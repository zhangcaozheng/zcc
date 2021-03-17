package com.example.jdbc;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.jdbc.config.RedisConfig;
import com.example.jdbc.entity.Student;
import com.example.jdbc.mapper.StudentMapper;
import com.example.jdbc.utils.redis.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JdbcApplicationTests {
    @Autowired
     StudentMapper studentMapper;

    @Test
    public  void show(){
        QueryWrapper<Student> queryWrapper=new QueryWrapper<>();
        List<Student> list=studentMapper.selectList(null);
        list.forEach(System.out::println);

    }

    @Test
    public  void show1(){
        List<Student> list= studentMapper.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public  void show2(){
     int h= studentMapper.findUpdate("Test",10002);

    }
    @Autowired
private RedisUtil redisUtil;
    @Test
    public void show3(){
//        Student student=new Student();
//        student.setSex("男");
//        student.setStudentname("张三");
//redisUtil.set("Name","haungyxia");
        System.out.println(redisUtil.get("username").toString());

    }



}
