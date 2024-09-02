package com.hsbc.dao;

import com.hsbc.model.Student;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


public interface StudentDao {
    public boolean createStudent (Student student) ;
    public Student readStudentById  (int studentId) throws IllegalArgumentException;
    public Student updateStudentById(int studentId) throws IllegalArgumentException;
    public boolean deleteStudentById(int studentId) throws IllegalArgumentException;
    public List<Student> readAllStudents();
}
