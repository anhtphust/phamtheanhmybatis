package com.example.demo_mybatis.service;

import com.example.demo_mybatis.entity.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentService {
    @Transactional(rollbackFor = Exception.class)
    public int insertStudent(Student student);
    @Transactional(rollbackFor = Exception.class)
    public int updateStudent(Student student);
    @Transactional(rollbackFor = Exception.class)
    public int deleteStudentById(int studentId);
    public List<Student> selectAllStudent();
    public Student selectStudentById(int studentId);
}
