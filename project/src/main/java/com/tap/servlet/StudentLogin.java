package com.tap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.tap.daoimp.StudentDaoImp;
import com.tap.model.Students;

/**
 * Servlet implementation class StudentLogin
 */
@WebServlet("/StudentLogin")
public class StudentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		String rollno = request.getParameter("rollno");
		String pass = request.getParameter("password");
		System.out.println(rollno + " " + pass);
		Students st = new Students();
		st = new StudentDaoImp().getStudent(rollno);
		
		if(st == null) {
			request.setAttribute("error", "Invalid rollno");
			request.getRequestDispatcher("studentlogin.jsp").forward(request, response);
		}else {
			if(st.getStudentPass().equals(pass)) {
				HttpSession session = request.getSession();
				session.setAttribute("studentid", st.getStudentId());
				request.setAttribute("student", st);
				int id = st.getStudentId();
				request.setAttribute("dep", new StudentDaoImp().getDepartment(id));
				request.setAttribute("mk", new StudentDaoImp().getMarks(id));
				request.getRequestDispatcher("studenthome.jsp").forward(request, response);
			} else {
				request.setAttribute("error", "Invalid password");
				request.getRequestDispatcher("studentlogin.jsp").forward(request, response);
			}

		}
		
	}


}
