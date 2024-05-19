package com.example.students.controller;

import com.example.students.model.Student;
import com.example.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @PostMapping("/createStudent")
  public Student createStudent(@RequestBody Student student) {
    return studentService.createStudent(student);
  }

  @GetMapping("/student/{id}")
  public Student getStudentById(@PathVariable Long id) {
    return studentService.getStudentById(id);
  }

  @DeleteMapping("/deleteStudent/{id}")
  public Student deleteStudentById(@PathVariable Long id) {
    return studentService.deleteStudentById(id);
  }
}
