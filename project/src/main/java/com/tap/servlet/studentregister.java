package com.tap.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.daoimp.StudentDaoImp;
import com.tap.model.Students;

/**
 * Servlet implementation class studentregister
 */
@WebServlet("/studentregister")
public class studentregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentregister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Students student = new Students(request.getParameter("name"), request.getParameter("rollno"), request.getParameter("password"), request.getParameter("dob"), request.getParameter("contact"), request.getParameter("department"));
		new StudentDaoImp().addStudent(student);
		
	}

}
