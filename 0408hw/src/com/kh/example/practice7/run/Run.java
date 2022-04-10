package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee emp = new Employee(100, "홍길동", "영업부", "과장", 25, 'M', 2500000, 
				0.05, "010-1234-5678", "서울 강남구");
	
		System.out.println("Employee Number : " + emp.getEmpNo());
		System.out.println("Name : " + emp.getEmpName());
		System.out.println("Department : " + emp.getDept());
		System.out.println("Job : " + emp.getJob());
		System.out.println("Age : " + emp.getAge());
		System.out.println("Gender : " + emp.getGender());
		System.out.println("Salary : " + emp.getSalary());
		System.out.println("BonusPoint : " + emp.getBonusPoint());
		System.out.println("Phone : " + emp.getPhone());
		System.out.println("Address : " + emp.getAddress());
	}
}
