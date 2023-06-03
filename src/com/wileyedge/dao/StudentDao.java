package com.wileyedge.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wileyedge.Student;

public class StudentDao implements StudentIDao{
	
	@Autowired
	private JdbcTemplate template;
	public StudentDao() {
		System.out.println("Inside DAO Default Constructor.");
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void saveStudent(Student stu) {
		String sql = "INSERT INTO Student VALUES (?, ?, ?, ?, ?)";
		System.out.println("TRYING:\n" + sql + "\n" + stu.getId() + "\n" + stu.getName() + "\n" + stu.getAge() + "\n" + stu.getMobile() + "\n" + stu.getAddress());
		template.update(sql, stu.getId(), stu.getName(), stu.getAge(), stu.getMobile(), stu.getAddress());
	}


	
}
