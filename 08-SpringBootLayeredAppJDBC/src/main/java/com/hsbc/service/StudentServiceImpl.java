package com.hsbc.service;

import com.hsbc.dao.StudentDao;
import com.hsbc.exceptions.DuplicateStudentException;
import com.hsbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao dao = null;

    public void setDao(StudentDao dao){
        this.dao = dao;
    }

    @Override
    public boolean addStudent(Student student)  {
       return dao.createStudent(student);
    }

    @Override
    public Student findStudentById(int studentId) {
        return dao.readStudentById(studentId);
    }

    @Override
    public Student updateStudentById(int studentId) {
        return dao.updateStudentById(studentId);
    }

    @Override
    public boolean deleteStudentById(int studentId) {
        return dao.deleteStudentById(studentId);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.readAllStudents();
    }
}
