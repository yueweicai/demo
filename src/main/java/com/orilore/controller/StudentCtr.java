package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.biz.IStudentBiz;
import com.orilore.model.Student;

@RestController
public class StudentCtr {
	@Resource
	private IStudentBiz biz;
	@RequestMapping("/student/find")
	public List<Student> find(){
		return biz.findStudent();
	}
}
