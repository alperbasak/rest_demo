package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by alper.basak on 25.09.2017.
 */
@RestController
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAll(){
        return studentDao.getAll();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentDao.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.POST,consumes = "application/json")
    public void insertStudent(@RequestBody Student student){
        studentDao.insertStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT,consumes = "application/json")
    public void updateStudent(@RequestBody Student student){
        studentDao.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public void deleteStudent(@PathVariable int id){
        studentDao.deleteStudent(id);
    }


}
