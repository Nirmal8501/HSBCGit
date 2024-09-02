package com.hsbc.service;

import com.hsbc.dao.StudentDao;
import com.hsbc.exceptions.DuplicateStudentException;
import com.hsbc.model.Student;

import java.util.List;

public interface StudentService {
    public void setDao(StudentDao dao);
    public boolean addStudent(Student student) ;
    public Student findStudentById (int studentId);
    public Student updateStudentById(int studentId);
    public boolean deleteStudentById(int studentId);
    public List<Student> findAllStudents();
}
