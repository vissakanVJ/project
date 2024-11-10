package com.tap.dao;

import java.util.ArrayList;

import com.tap.model.EnterMarks;

public interface SubjectDao {
	
	ArrayList<EnterMarks> getSubjects(int depid);

}
