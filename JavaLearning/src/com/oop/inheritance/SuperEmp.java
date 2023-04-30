package com.oop.inheritance;

import java.math.BigDecimal;

public class SuperEmp extends SuperPerson {
	private String title;
	private String employer;
	private char employeeGrade;
	private BigDecimal salary;

	public SuperEmp(String name, String title) {
		super(name);
		System.out.println("Sub Class");
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("\nEmployer = %s, Title = %s, Grade = %s, ", employer, title, employeeGrade)
				+ "Salary = " + salary;

	}
}
