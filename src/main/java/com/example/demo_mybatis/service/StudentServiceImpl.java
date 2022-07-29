package com.example.demo_mybatis.service;

import java.util.List;

import com.example.demo_mybatis.entity.Student;
import com.example.demo_mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    public int insertStudent(Student student) {
        System.out.println("##### " +student.getName() +"   ####");
        return studentMapper.insertStudent(student);
    }

    public int deleteStudentById(int studentId) {
        return studentMapper.deleteStudentById(studentId);
    }

    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    public Student selectStudentById(int studentId) {
        return studentMapper.selectStudentById(studentId);
    }
}
