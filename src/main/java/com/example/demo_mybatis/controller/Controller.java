package com.example.demo_mybatis.controller;

import com.example.demo_mybatis.entity.Teacher;
import com.example.demo_mybatis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/controller")
public class Controller {
    @Autowired
    TeacherService teacherService;

    @GetMapping("teacher/all")
    List<Teacher> getAllTeacher(){
        return teacherService.selectAllTeacher();
    }

    @PostMapping("teacher/update")
    int updateTeacher(@RequestBody Teacher teacher){
        return teacherService.updateTeacher(teacher);
    }

    @PostMapping("teacher/insert")
    int insertTeacher(@RequestBody Teacher teacher){
        return teacherService.insertTeacher(teacher);
    }

    @PostMapping("teacher/delete/{id}")
    int deleteTeacher(@PathVariable int id){
        return teacherService.deleteTeacherById(id);
    }
}
