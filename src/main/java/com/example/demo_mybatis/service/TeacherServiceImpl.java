package com.example.demo_mybatis.service;

import com.example.demo_mybatis.entity.Student;
import com.example.demo_mybatis.entity.Teacher;
import com.example.demo_mybatis.mapper.StudentMapper;
import com.example.demo_mybatis.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "teacherService")
public class TeacherServiceImpl implements  TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher);
    }

    public int insertTeacher(Teacher teacher) {
        System.err.println("###############################33####");
        System.err.println("##### " +teacher.getName() +"   ####");
        System.err.println("###############################33####");
        return teacherMapper.insertTeacher(teacher);
    }

    public int deleteTeacherById(int studentId) {
        return teacherMapper.deleteTeacherById(studentId);
    }

    public List<Teacher> selectAllTeacher() {
        return teacherMapper.selectAllTeacher();
    }

    public Teacher selectTeacherById(int teacherId) {
        return teacherMapper.selectTeacherById(teacherId);
    }
}
