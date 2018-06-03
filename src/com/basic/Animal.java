package com.basic;
public abstract class Animal
	 {
			public abstract  void getMethod() ;
	 
		
		
		public static void main(String[] args)
		{
			SubAni  sub=new SubAni();
			sub.getMethod();
			System.out.println("null");

		}
	 }	
class SubAni extends Animal {
	


@Override
public void getMethod() {
	
	
}}
