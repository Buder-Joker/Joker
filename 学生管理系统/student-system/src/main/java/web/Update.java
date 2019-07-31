package web;

import dao.StudentDao;
import user.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class Update extends HttpServlet  {
    private static final long serialVersionUID = 1L;

    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset= utf-8");

        String  stuId = request.getParameter("stuId");
        StudentDao studentDAO = new StudentDao();
        Student student = studentDAO.findByIdStudent(stuId);
        request.setAttribute("student", student);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset= utf-8");

        String stuId = request.getParameter("stuId");
        String stuName = request.getParameter("stuName");
        String stuSex = request.getParameter("stuSex");
        String stuBid = request.getParameter("stuBid");
        Student student = new Student(stuId,stuName, stuSex, stuBid);

        StudentDao studentDAO = new StudentDao();
        studentDAO.modify(student);
        response.sendRedirect("StudentList");
    }
}
