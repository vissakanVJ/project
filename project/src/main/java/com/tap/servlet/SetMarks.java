package com.tap.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tap.daoimp.MarksDaoImp;
import com.tap.model.EnterMarks;

/**
 * Servlet implementation class SetMarks
 */
@WebServlet("/SetMarks")
public class SetMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetMarks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		ArrayList<EnterMarks> list = (ArrayList<EnterMarks>) session.getAttribute("list");
		for(EnterMarks i : list) {
			i.setMarks(Double.parseDouble(request.getParameter(i.getSub())));
		}
		int o = new MarksDaoImp().populateMarks(list, (int)session.getAttribute("studentid"));
		System.out.println("end" + o);
		
	}

	
}
