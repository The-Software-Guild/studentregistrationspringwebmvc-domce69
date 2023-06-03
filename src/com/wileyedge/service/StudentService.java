package com.wileyedge.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.wileyedge.Student;
import com.wileyedge.dao.StudentDao;
import com.wileyedge.dao.StudentIDao;

public class StudentService implements StudentIService {
	
	@Autowired
	StudentDao dao;
	public StudentService() {
		
	}
	
	@Override
	public void saveStud(Student s) {
		dao.saveStudent(s);
	}


}
