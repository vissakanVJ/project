package com.tap.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tap.dao.SubjectDao;
import com.tap.dbutil.Dbutil;
import com.tap.model.EnterMarks;

public class SubjectDaoImp implements SubjectDao {
	
	Connection con;
	ArrayList<EnterMarks> list = new ArrayList<EnterMarks>();
	
	public SubjectDaoImp() {
		this.con = Dbutil.myConnect();
	}

	@Override
	public ArrayList<EnterMarks> getSubjects(int depid) {
		// TODO Auto-generated method stub
		try {
			
			PreparedStatement pstmt = con.prepareStatement("select subid, subname from subjects where depid = ?");
			pstmt.setInt(1, depid);
			ResultSet res =  pstmt.executeQuery();
			while(res.next() == true) {
				list.add(new EnterMarks(res.getInt(1), res.getString(2)));
			}
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	

}
