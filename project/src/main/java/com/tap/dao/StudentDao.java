package com.tap.dao;

import java.util.ArrayList;

import com.tap.model.*;

public interface StudentDao {

	int addStudent(Students s);
	ArrayList<Students> getAllStudents();
	Students getStudent(String rollno);
	Students getStudent(int studentId);
	String getDepartment(int id);
	ArrayList<DisplayMarks> getMarks(int studentid);
	
}
