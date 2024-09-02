package com.hsbc.ui;

import com.hsbc.config.AppConfig;
import com.hsbc.dao.StudentDao;
import com.hsbc.dao.StudentDaoImpl;
import com.hsbc.exceptions.DuplicateStudentException;
import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
import com.hsbc.service.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan(basePackages = "com.hsbc")
public class Main {
    public static void main(String[] args) {

        ApplicationContext context =  SpringApplication.run(Main.class);
        Student student = context.getBean(Student.class);

        StudentService service = context.getBean(StudentService.class);  // will give object of student service impl class and not interface.
//        StudentService service = (StudentService) context.getBean("service");

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Student ID : ");
//        int sid =  sc.nextInt()
//        student.setStudentId(1001);
//        student.setStudentName("Gurudev");
//        student.setStudentScore(89.99);
//        student.getDept().setDeptId(10);
//        student.getDept().setDeptName("Computer Science");
//
//        Student student2 = context.getBean(Student.class);
//        student2.setStudentId(1002);
//        student2.setStudentName("Achyuta");
//        student2.setStudentScore(89.99);
//        student2.getDept().setDeptId(20);
//        student2.getDept().setDeptName("Computer Science");
//
//        Student student3 = context.getBean(Student.class);
//        student3.setStudentId(1003);
//        student3.setStudentName("Nirmal");
//        student3.setStudentScore(89.99);
//        student3.getDept().setDeptId(10);
//        student3.getDept().setDeptName("Computer Science");


//        boolean res =  service.addStudent(student);
//        service.addStudent(student2);
//        service.addStudent(student3);



//        if(res){
//            System.out.println("Student is Added");
//        }

//        List<Student> ls = service.findAllStudents();
//        for(Student s : ls) System.out.println(s.getStudentName());
//        service.findAllStudents().stream().forEach(stud -> System.out.println(stud.getStudentName()));

        System.out.println("Students are added....");

//        Student res = service.findStudentById(1001);
//        System.out.println(res.getStudentName());
//
//        Student res2 = service.updateStudentById(1001);
//        System.out.println(res2.getStudentName());

//        Student student3 = context.getBean(Student.class);
//        student3.setStudentId(1003);
//        student3.setStudentName("Nirmal");
//        student3.setStudentScore(89.99);
//        student3.getDept().setDeptId(10);
//        student3.getDept().setDeptName("Computer Science");
//
////        try {
//            service.addStudent(student3);
//        } catch (DuplicateStudentException e) {
//            System.out.println(e.getMessage());
//        }

        List<Student> ls = service.findAllStudents();
        for(Student s : ls) System.out.println(s.getStudentId() + " --> "+ s.getStudentName() + " --> " + s.getStudentScore());
    }
}
