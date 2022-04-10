package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 5;
		classroom = 1;
		name = "±Ë≈¬¿∫";
		height = 160.5;
		gender = 'F';
		
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Student() {
		
	}
	
	public void information() {
		System.out.println("grade : "+ grade);
		System.out.println("classroom : "+ classroom);
		System.out.println("name : "+ name);
		System.out.println("height : "+ height);
		System.out.println("gender : "+ gender);
	}
}
