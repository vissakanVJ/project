package com.tap.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tap.dao.StudentDao;

import com.tap.dbutil.*;
import com.tap.model.*;

public class StudentDaoImp implements StudentDao {
	
	Connection con;
	ArrayList<Students> studentList = new ArrayList<Students>();
	ArrayList<DisplayMarks> markList = new ArrayList<DisplayMarks>();
	
	
	public StudentDaoImp() {
		this.con =  Dbutil.myConnect();
	}

	@Override
	public int addStudent(Students s) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into Students (studentname, rollno, studentpass, dob, contactno, depid) values(?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, s.getStudentName());
			pstmt.setString(2, s.getRollNo());
			pstmt.setString(3, s.getStudentPass());
			pstmt.setString(4, s.getDob());
			pstmt.setString(5, s.getContactno());
			pstmt.setInt(6, s.getDepId());
		    pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Students getStudent(String rollno) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from Students where rollno = ?");
			pstmt.setString(1, rollno);
			ResultSet res = pstmt.executeQuery();
			res.next();
			return new Students(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public String getDepartment(int id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = con.prepareStatement("select depname from department where depid = (select depid from Students where studentid = ? LIMIT 1)");
			pstmt.setInt(1, id);
			ResultSet res = pstmt.executeQuery();
			res.next();
			return res.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public ArrayList<DisplayMarks> getMarks(int studentid) {
		// TODO Auto-generated method stub
		try {
			
			PreparedStatement pstmt = con.prepareStatement("select sub.subname, sub.sem, m.marks from students s join marks m on s.studentid = m.studentid join subjects sub on m.subid = sub.subid where s.studentid = ?");
			pstmt.setInt(1, studentid);
			ResultSet res = pstmt.executeQuery();
			if(res.next() == false) {
				return null;
			}
			do {
				markList.add(new DisplayMarks(res.getString(1), res.getInt(2), res.getDouble(3)));
			}
			while(res.next() == true);
			return markList;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Students getStudent(int studentId) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from Students where studentid = ?");
			pstmt.setInt(1, studentId);
			ResultSet res = pstmt.executeQuery();
			res.next();
			return new Students(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}


}
