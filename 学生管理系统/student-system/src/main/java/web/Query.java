package web;

import dao.StudentDao;
import user.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Query extends HttpServlet{
    private static final long serialVersionUID = 1L;


    public Query() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("query.jsp");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stuId = request.getParameter("stuId");
        StudentDao studentDAO = new StudentDao();
        Student student = studentDAO.findByIdStudent(stuId);
        request.setAttribute("student", student);
        request.getRequestDispatcher("query1.jsp").forward(request, response);
    }
}
