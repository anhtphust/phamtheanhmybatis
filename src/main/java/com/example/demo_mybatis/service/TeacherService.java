package com.example.demo_mybatis.service;

import com.example.demo_mybatis.entity.Student;
import com.example.demo_mybatis.entity.Teacher;

import java.util.List;

public interface TeacherService {
    public int insertTeacher(Teacher teacher);
    public int updateTeacher(Teacher teacher);
    public int deleteTeacherById(int teacherId);
    public List<Teacher> selectAllTeacher();
    public Teacher selectTeacherById(int teacherId);
}
