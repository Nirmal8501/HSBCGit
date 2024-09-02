package com.hsbc.dao;

import com.hsbc.model.Department;
import com.hsbc.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        Department department = new Department();
        student.setDept(department);

        student.setStudentId(rs.getInt("stud_id"));
        student.setStudentName(rs.getString("stud_name"));
        student.setStudentScore(rs.getDouble("stud_score"));
        student.getDept().setDeptId(rs.getInt("dept_id"));
        return student;
    }
}
