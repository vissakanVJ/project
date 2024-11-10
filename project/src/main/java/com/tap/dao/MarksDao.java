package com.tap.dao;

import java.util.ArrayList;

import com.tap.model.EnterMarks;

public interface MarksDao {
	
	int populateMarks(ArrayList<EnterMarks> list, int studentid);

}
