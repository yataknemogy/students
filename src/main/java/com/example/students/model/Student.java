package com.example.students.model;
import lombok.data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
@Getter
public class Student {
    @Id
    private Long id;
    private String firstName;
    private String secondName;
    private String mail;
    private int age;
}
