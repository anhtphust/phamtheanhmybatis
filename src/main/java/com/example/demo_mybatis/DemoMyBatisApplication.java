package com.example.demo_mybatis;

import com.example.demo_mybatis.MybatisConfig.AppConfig;
import com.example.demo_mybatis.entity.Student;
import com.example.demo_mybatis.entity.Teacher;
import com.example.demo_mybatis.service.StudentService;
import com.example.demo_mybatis.service.TeacherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoMyBatisApplication {
public static void main(String[] args) {
//    AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//    StudentService studentService = (StudentService) context.getBean("studentService");
//    TeacherService teacherService = (TeacherService) context.getBean("teacherService");
//
//    // create teacher
//    Teacher teacher = new Teacher("Do", 9100, "do@gmail.com");
//    // insert teacher
//    teacherService.insertTeacher(teacher);
//    System.out.println("Teacher : " + teacher);
//
//    // select all teacher
//    List<Teacher> list = teacherService.selectAllTeacher();
//    System.out.println("select all : ");
//    for (Teacher teacher1 : list) {
//        System.out.println(teacher1);
//    }
//    // create student
//    Student student1 = new Student("Do", "Java Dev 2000$", 9100, 0123, "do@gmail.com");
//
//    // insert student
//    studentService.insertStudent(student1);
//    System.out.println("insert : " + student1);
//
//    // select all student
//    List<Student> listStudents = studentService.selectAllStudent();
//    System.out.println("select all : ");
//    for (Student student : listStudents) {
//        System.out.println(student);
//    }
//
//    // select student by id
//    Student student2 = studentService.selectStudentById(1);
//
//    // update student
//    student2.setPercentage(99);
//    studentService.updateStudent(student2);
//    System.out.println("update : " + student2);
//
//    // delete student by id
//    studentService.deleteStudentById(student2.getId());
//    System.out.println("delete : " + student2);
    SpringApplication.run(DemoMyBatisApplication.class, args);
}
}
