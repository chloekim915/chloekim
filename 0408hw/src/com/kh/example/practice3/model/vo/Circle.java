package com.kh.example.practice3.model.vo;

public class Circle {
	private double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
	}
	
	public void setter(double PI, int radius) {
		this.PI = PI;
		this.radius = radius;
	}
	
	public double getPI() {
		return PI;
	}
	
	public int getRadius() {
		return radius;
	}
//	public void getter(double PI, int radius) {
//		this.PI = PI;
//		this.radius = radius;
//	}
	
	public void incrementRadius() {
		radius += 1;
	}
	
	public void getAreaOfCircle() { //원의 넓이
		double areaOfCircle = radius * radius * PI;
		System.out.println("원의 넓이 : " + areaOfCircle);
	}
	
	public void getSizeOfCircle() { //원의 둘레
		double sizeOfCircle = 2 * radius * PI;
		System.out.println("원의 둘레 : " + sizeOfCircle);
	}
}