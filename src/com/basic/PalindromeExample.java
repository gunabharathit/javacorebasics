package com.basic;

public class PalindromeExample {
	 
		 public static void main(String args[]){  
		  int r,a=0,temp;    
		  int n=7631;  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   a=(a*10)+r;    
		     n=n/10; 
		  }    
		  if(temp==a)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  


