package com.tap.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tap.daoimp.DepartmentDaoImp;
import com.tap.daoimp.StudentDaoImp;
import com.tap.daoimp.SubjectDaoImp;
import com.tap.model.EnterMarks;
import com.tap.model.Students;

/**
 * Servlet implementation class EnterMark
 */
@WebServlet("/EnterMark")
public class EnterMark extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterMark() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		int id = (int)session.getAttribute("studentid");
		String dep = (String)request.getParameter("dep");
		System.out.println(dep);
		int depid = new DepartmentDaoImp().getDepId(dep);
		System.out.println(depid);
		ArrayList<EnterMarks> list = new ArrayList<EnterMarks>();
		list = new SubjectDaoImp().getSubjects(depid);
		Students st = new StudentDaoImp().getStudent(id);
		request.setAttribute("st", st);
		request.setAttribute("list", list);
		session.setAttribute("list", list);
		request.getRequestDispatcher("entermarks.jsp").forward(request, response);
		
		
		
	}


}
