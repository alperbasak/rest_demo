package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by alper.basak on 25.09.2017.
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    private static HashMap<Integer,Student> students=new HashMap<>();

    @Override
    public Collection<Student> getAll(){
        return students.values();
    }

    @Override
    public Student getStudentById(int id){
        return students.get(id);
    }

    @Override
    public void insertStudent(Student student){
        students.put(student.getId(),student);
    }

    @Override
    public void updateStudent(Student student){
        Student s=students.get(student.getId());
        s.setName(student.getName());
        s.setCgpa(student.getCgpa());
    }

    @Override
    public void deleteStudent(int id){
        students.remove(id);
    }
}
