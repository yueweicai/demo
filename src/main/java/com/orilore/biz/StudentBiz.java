package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
public class StudentBiz implements IStudentBiz{
	@Resource
	private StudentMapper mapper;
	@Override
	public boolean addStudent(Student bean) {
		try{
			mapper.insert(bean);
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean removeStudent(int id) {
		try{
			mapper.delete(id);
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	@Override
	public boolean modifyStudent(Student bean) {
		try{
			mapper.update(bean);
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	@Override
	public Student getStudent(int id) {
		return mapper.selectOne(id);
	}
	@Override
	public List<Student> findStudent() {
		return mapper.select();
	}
}
