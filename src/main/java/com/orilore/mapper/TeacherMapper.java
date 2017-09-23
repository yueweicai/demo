package com.orilore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.orilore.model.Teacher;

@Mapper
public interface TeacherMapper {
	@Select("select * from teacher")
	public List<Teacher> select();
	
}
