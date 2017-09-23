package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface StudentMapper{
	public void insert(Student bean);
	public Student selectOne(int sid);
	public void delete(int sid);
	public List<Student> select();
	public void update(Student bean);
}