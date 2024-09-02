package com.hsbc.dao;

import com.hsbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentDaoImpl implements StudentDao{
    @Autowired
    private List<Student> studentDB = null;

    public void setStudentDB(List<Student> studentDB) {
        this.studentDB = studentDB;
    }

    @Override
    public boolean createStudent(Student student) {
        boolean res = studentDB.add(student);
        return res;
    }

    @Override
    public Student readStudentById(int studentId) {
        Student student = null;
        Optional<Student> obj =  studentDB.stream().filter((stud)-> studentId == stud.getStudentId()).findFirst();
        if(obj.isPresent()){
            student = obj.get();
        }
        return student;
    }

    @Override
    public Student updateStudentById(int studentId) {
        return null;
    }

    @Override
    public boolean deleteStudentById(int studentId) {
        return false;
    }

    @Override
    public List<Student> readAllStudents() {
        return studentDB;
    }
}
