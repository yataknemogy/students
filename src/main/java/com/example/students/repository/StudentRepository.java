package com.example.students.repository;

import com.example.students.model.Student;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {

  @Override
  Optional<Student> findById(Long id);
}
