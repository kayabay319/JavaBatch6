package com.syntax.class22;

import com.syntax.class22.Employee.Contractor;
import com.syntax.class22.Employee.FullTimeEmployee;

public class EmployeeTest {
	public static void main(String[] args) {
	
	Employee emp = new Employee();
	emp.salary = 80000;
	emp.getPaid();
	
	FullTimeEmployee ft = new FullTimeEmployee();
	ft.salary=90000;
	ft.getPaid();

	Contractor ct = new Contractor(); //Constractor likes to create its own method same name with the parent class method name
	ct.hourlyRate = 50;
	ct.getPaid();
	
	
	

}