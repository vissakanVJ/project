package com.tap.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;



import com.tap.dao.MarksDao;
import com.tap.dbutil.Dbutil;
import com.tap.model.EnterMarks;

public class MarksDaoImp implements MarksDao {
	
	Connection con;
	
	public MarksDaoImp() {
		// TODO Auto-generated constructor stub
		this.con = Dbutil.myConnect();
	}

	@Override
	public int populateMarks(ArrayList<EnterMarks> list, int studentid) {
		// TODO Auto-generated method stub
		try {
			for(EnterMarks i : list) {
				PreparedStatement pstmt = con.prepareStatement("insert into marks values(?, ?, ?)");
				pstmt.setInt(1,studentid);
				pstmt.setInt(2, i.getSubId());
				pstmt.setDouble(3, i.getMarks());
				pstmt.executeUpdate();
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
