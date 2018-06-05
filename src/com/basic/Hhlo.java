package com.basic;

public class Multiple {
	public static void main(String[] args)
	{
		Multiple multiple=new Multiple();
		System.out.println("IS 6 a perfect number"+multiple);
		System.out.println("IS 4 a multiple of two"+multiple);
	}
	
public boolean isMultiple(int one,int two) {
	return two%one==0?true:false;
}
public boolean isEven(int one)
{
	return one%2==0?true:false;
	
}


public double convertftoc(double celsious) {
	return 5.0/9.0*celsious+32;
}

public boolean isPerfect(int number)
{
	int sum=0;
	for(int i=1;i<=number/2;i++)
	{
		if(number%i==0)
		{
			sum=sum+i;
		}}
	if(sum==number) {
		return true;}
		
			else {
		return false ;
		}
	}
}