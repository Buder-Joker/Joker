package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


import dao.StudentDao;
import user.Student;

public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendRedirect("add.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset= utf-8");
        String stuId = req.getParameter("stuId");
        String stuName  = req.getParameter("stuName");
        String stuSex = req.getParameter("stuSex");
        String stuBid = req.getParameter("stuBid");
        //封装成对象
        Student s1 = new Student(stuId, stuName, stuSex, stuBid);
        StudentDao studentDAo = new StudentDao();
        studentDAo.add(s1);
        resp.sendRedirect("StudentList");
    }
}
