package com.lovo.mapper;

import java.sql.Date;

import com.lovo.entity.StuEntity;
import com.lovo.entity.TeacherEntity;
import com.sun.tools.javac.util.List;

public interface StuMapper {
	public void addStu(StuEntity stu);
	public void delStu(String id);
	public void update(String id,int score);
	public StuEntity findByStuId(String stuid);
	public List<StuEntity> findAll();
	public List<StuEntity> findByItem(String sex,int age,int score,TeacherEntity teacher,Date birthday);

}
