package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.Collection;

/**
 * Created by alper.basak on 25.09.2017.
 */
public interface StudentDao {
    Collection<Student> getAll();

    Student getStudentById(int id);

    void insertStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);
}
