package com.hsbc.dao;

import com.hsbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Scanner;

@Repository
@Primary
public class StudentDaoJDBCImpl implements StudentDao{

    @Autowired
    private JdbcTemplate template;

    @Override
    public boolean createStudent(Student student)  {

//        String checkQuery = "SELECT COUNT(*) FROM student WHERE stud_id = "+student.getStudentId();
//          res = template.query(checkQuery, new StudentRowMapper());


//        if (res == null ) {
//            throw new IllegalArgumentException("Student with ID " + student.getStudentId() + " already exists.");
//        }

        String query = "Insert Into Student(stud_id, stud_name, stud_score, dept_id) values (?, ?, ?, ?)";
        int resbool =0;

        resbool = template.update(query, student.getStudentId(), student.getStudentName(), student.getStudentScore(), student.getDept().getDeptId());
        if(resbool==1) return true;
        return false;
    }

    @Override
    public Student readStudentById(int studentId) throws IllegalArgumentException {
        String query = "Select * from student where stud_id = "+studentId;
        Student res =  template.queryForObject(query, new StudentRowMapper());
        return res;
    }

    @Override
    public Student updateStudentById(int studentId) throws IllegalArgumentException{
        String query = "Select * from student where stud_id = "+studentId;
        Student res =  template.queryForObject(query, new StudentRowMapper());

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("Enter the Updated Name : ");
        String name = sc.nextLine();
        String query2 = "UPDATE Student SET stud_name = ? WHERE stud_id ="+studentId;
        template.update(query2, name);
        res.setStudentName(name);
        return res;
    }

    @Override
    public boolean deleteStudentById(int studentId) throws IllegalArgumentException{
        String query = "DELETE from Student where stud_id="+studentId;
        int res = template.update(query);
        return res==1;
    }

    @Override
    public List<Student> readAllStudents() {
        String query = "SELECT * from Student";
        List<Student> res = template.query(query, new StudentRowMapper());
        return res;
    }
}
