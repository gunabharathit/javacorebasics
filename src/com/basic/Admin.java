package com.basic;

public class Admin {
	public static void main(String[] args)
	{
		Invoice Invoice1=new Invoice();
		Invoice1.setQuantity(5);
		Invoice1.setPrice(100);
		Invoice1.setDescription("bolt");
		System.out.println(Invoice1.getQuantity());
		double a=Invoice1.getinvoiceAmount();
		System.out.println(Invoice1.getinvoiceAmount());
	}

}
