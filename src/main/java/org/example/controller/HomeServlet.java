package org.example.controller;



import org.example.dao.StudentDao;
import org.example.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/homepage")
public class HomeServlet extends HttpServlet {

    StudentDao studentDao =new StudentDao();


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentDao.listStudent();
        req.setAttribute("Students",studentList);
        req.getRequestDispatcher("list-student.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student();
//        resp.setContentType("text/html");
        student.setName(req.getParameter("name"));
        student.setClg(req.getParameter("clg"));
        student.setCls(req.getParameter("cls"));


        int value= studentDao.addStudent(student);
        if(value==1){
            System.out.println("sucessful");
            resp.sendRedirect("successfull.jsp");
        }else{
            System.out.println("value : "+value);
        }

//        service.listStudent();

    }
}
