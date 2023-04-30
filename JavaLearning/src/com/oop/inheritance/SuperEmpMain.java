package com.oop.inheritance;

import java.math.BigDecimal;

public class SuperEmpMain {

	public static void main(String[] args) {
		SuperEmp emp = new SuperEmp("Tulsi Kant", "Software Development Analyst");
		// emp.setName("Tulsi Kant");
		emp.setAge(25);
		emp.setEmployer("NTT Data");
		// emp.setTitle("Software Development Analyst");
		emp.setEmployeeGrade('A');
		emp.setSalary(new BigDecimal(75000.00));
		System.out.println(emp.toString());
	}

}
