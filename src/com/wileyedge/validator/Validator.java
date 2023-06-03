package com.wileyedge.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.wileyedge.Student;

@Component(value = "stuVal")
public class Validator implements org.springframework.validation.Validator {

	@Override
	public boolean supports(Class clas) {
		System.out.println("Inside supports() of StudentValidator");
		return Student.class.equals(clas);
	}

	@Override
	public void validate(Object target, Errors error) {
		System.out.println("Inside validate() of StudentValidator");
		Student stu = (Student)target;
		//ValidationUtils.rejectIfEmpty(error, "fname", "fname.error");
		//ValidationUtils.rejectIfEmpty(error, "lname", "lname.error");
		
	}


}
