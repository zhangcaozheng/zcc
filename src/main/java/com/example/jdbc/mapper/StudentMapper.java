package com.example.jdbc.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jdbc.entity.Student;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface StudentMapper extends BaseMapper<Student> {

    @Select("select * from student")
    List<Student> findAll();

    @Update("UPDATE  `student` SET `studentName`=#{name}\n" +
            "WHERE `studentNo`=#{id}")
     int findUpdate(String name,Integer id);



}
