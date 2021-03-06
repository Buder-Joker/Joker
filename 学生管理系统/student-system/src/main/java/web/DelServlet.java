package web;

import dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String stuId = req.getParameter("stuId");
        StudentDao studentDao = new StudentDao();
        studentDao.remove(stuId);
        resp.sendRedirect("StudentList");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
       doGet(req,resp);
    }
}
