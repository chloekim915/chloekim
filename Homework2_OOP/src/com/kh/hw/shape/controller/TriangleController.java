package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	Shape s = new Shape();
	
	public double calcArea(double heigth, double width) {
		s.setType(3);
		s.setHeight(heigth);
		s.setWidth(width);
		
		return (width * heigth)/2;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "»ï°¢Çü" + s.information();
		
	}
	
	

}
