package com.kh.hw.employee.model.vo;

public class Employee {
	private int empNo;
	private String name;
	private String dept;
	private char gender;
	private int salary;
	private double bonus;
	private String phone;
	
	public Employee() {
		
	}
	
	public Employee(int empNo, String name, char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public String printEmployee() {
		String result = "";
		result += "empNo : " + empNo + "\n";
		result += "name : " + name + "\n";
		result += "gender : " + gender + "\n";
		result += "phone : " + phone + "\n";
		result += "dept : " + dept + "\n";
		result += "salary : " + salary + "\n";
		result += "bonus : " + bonus + "\n";

		return result;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
