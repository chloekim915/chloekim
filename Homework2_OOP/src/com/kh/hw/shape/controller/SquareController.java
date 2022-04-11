package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimete(double heigth, double width) {
		s.setType(4);
		s.setHeight(heigth);
		s.setWidth(width);
		
		return (width + heigth)*2;
		
	}
	
	public double calcArea(double heigth, double width) {
		s.setType(4);
		s.setHeight(heigth);
		s.setWidth(width);
		
		return width*heigth;
		
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "»ç°¢Çü" + s.information();
		
	}
	

}
