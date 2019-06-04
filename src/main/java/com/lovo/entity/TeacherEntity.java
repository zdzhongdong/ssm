package com.lovo.entity;

import java.sql.Date;

public class TeacherEntity {
	private String teacherId;
	private String teacherName;
	private String className;
	private Date teacherBirthday;
	private String teacherSex;
	public TeacherEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Date getTeacherBirthday() {
		return teacherBirthday;
	}
	public void setTeacherBirthday(Date teacherBirthday) {
		this.teacherBirthday = teacherBirthday;
	}
	public String getTeacherSex() {
		return teacherSex;
	}
	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}
	

}
