package com.tap.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tap.dao.DepartmentDao;
import com.tap.dbutil.Dbutil;

public class DepartmentDaoImp implements DepartmentDao {
	
	Connection con;
	
	public DepartmentDaoImp() {
		this.con = Dbutil.myConnect();
	}

	@Override
	public int getDepId(String depName) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement pstmt = con.prepareStatement("select depid from department where depname = ?");
			pstmt.setString(1, depName);
			ResultSet res = pstmt.executeQuery();
			res.next();
			return res.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
