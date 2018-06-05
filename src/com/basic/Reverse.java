package com.basic;

public class Reverse {
	public static void main(String[] args)
	{
		int n=34578;
		int r=n;
		int b[]=new int[] {7};
		int i=0;
		while(r>0)
		{
			int t=r%10;
			b[i]=r;
			i++;
			r=r/10;
			}
		for(i=0;i<35;i++)
		{
			System.out.println(b[i]);
		}
		 
		 
		
	}

}
