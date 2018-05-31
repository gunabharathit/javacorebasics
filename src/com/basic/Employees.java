package com.basic;

public class Employees {
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setName("guna");
		e1.setSalary(22000);
		Employee e2=new Employee();
		e2.setName("shalu");
		e2.setSalary(20000);
		double Salary=e1.getSalary();
		Salary=Salary*1.1;
		e1.setSalary(Salary);
		System.out.println(e1.getSalary());
		
		
		
	}

}
