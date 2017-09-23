package com.orilore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.mapper.TeacherMapper;
import com.orilore.model.Teacher;

@RestController
public class WelcomeCtr {
	@Resource
	private TeacherMapper mapper;
	
	@RequestMapping("/")
	public String index(){
		return "Hello World";
	}
	
	@RequestMapping("/list")
	public List<Teacher> query(){
		return this.mapper.select();
	}
}
