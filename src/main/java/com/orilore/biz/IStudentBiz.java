package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IStudentBiz{
	public boolean addStudent(Student student);
	public boolean removeStudent(int sid);
	public boolean modifyStudent(Student student);
	public Student getStudent(int sid);
	public List<Student> findStudent();
}