package com.basic;

public class Invoice {
	String partNumber;
	String description;
	int quantity;
	double price;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0)
			{
			this.quantity=0;
			}
		else {
	this.quantity = quantity;
	}}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getprice(){
		return price;
	}
	public void setprice(double price) {
		if(price<0.0)
		{
			this.price=0.0;
		}
		else
		{
			this.price=price;
		}}

 public double getinvoiceAmount()
 {
	 double invoiceAmount=price*quantity;
	 return invoiceAmount;
 }}

