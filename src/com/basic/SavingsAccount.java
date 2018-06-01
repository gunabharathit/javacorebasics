package com.basic;

public class SavingsAccount {
	public static int annuvalInterestRate;
	 private double savingsBalance;
	 public SavingsAccount(double balance) {
	this.savingsBalance=balance;
		 
	 }
	 public void calculateMonthlyInterest()
	 {
		 double interest=((annuvalInterestRate/100.0)*savingsBalance)/12;
		 savingsBalance=savingsBalance+annuvalInterestRate;
	 }
	 public static void modifyInterestRate(int newValue)
	 {
		annuvalInterestRate=newValue;
		
	 }
	 public void showBalance() {
		 System.out.println("balance"+savingsBalance);
	 }
	 public static void main(String[] args) {
		 SavingsAccount sb1=new SavingsAccount(2000);
		 SavingsAccount sb2=new SavingsAccount(3000);
		 SavingsAccount.modifyInterestRate(4);
		 sb1.showBalance();
		 sb2.showBalance();
		 sb1.calculateMonthlyInterest();
		 sb2. calculateMonthlyInterest();
		 SavingsAccount.modifyInterestRate(5);
		 sb1.showBalance();
		 sb2.showBalance();
		 sb1.calculateMonthlyInterest();
		 sb2. calculateMonthlyInterest();
	 }}
		 
		 
		 
		 
	 
	 
