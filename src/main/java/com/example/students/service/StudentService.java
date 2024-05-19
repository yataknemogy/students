package com.example.students.service;

import com.example.students.model.Student;
import com.example.students.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }


  public Student createStudent(Student student) {
    return studentRepository.save(student);
  }

  public Student getStudentById(Long id) {
    return studentRepository.findById(id).orElse(null);
  }

  public Student deleteStudentById(Long id) {
    studentRepository.deleteById(id);
    return null;
  }
}
