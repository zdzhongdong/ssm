package com.lovo.entity;

import java.sql.Date;

public class StuEntity {
	private String stuId;
	private String stuName;
	private int age;
	private String pwd;
	private String sex;
	private Date birthDay;
	private int score;
	private TeacherEntity teacher;
	public StuEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public TeacherEntity getTeacher() {
		return teacher;
	}
	public void setTeacher(TeacherEntity teacher) {
		this.teacher = teacher;
	}

}
