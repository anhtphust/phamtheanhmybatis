package com.example.demo_mybatis.mapper;

import com.example.demo_mybatis.entity.Student;
import com.example.demo_mybatis.entity.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeacherMapper {
    public int insertTeacher(Teacher teacher);
    public int updateTeacher(Teacher teacher);
    public int deleteTeacherById(int teacherId);
    public List<Teacher> selectAllTeacher();
    public Teacher selectTeacherById(int teacherId);
}
