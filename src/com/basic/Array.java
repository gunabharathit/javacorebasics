package com.basic;

public class Array {
	public static void main(String[] args)
	{ 
		int n=7899;
		int t=n;
		int a[]= new int[10];
		int i=0;
		while(t>0) {
		int	r=t%10;
			 a[i]=r; 
			 i++;
			t=t/10;
		}
			for(i=0; i<10; i++)
			{
			   System.out.println(a[i]);
			}       
		   }
		}



