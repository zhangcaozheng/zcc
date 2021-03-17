package com.example.jdbc.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "Student")
public class Student {
    @TableId(value = "studentno",type = IdType.AUTO)
    private Integer studentno;
   @TableField(value = "studentname")
    private String studentname;
   @TableField(select = false)
    private String sex;
   @TableField(exist = false)
    private String test;



}
