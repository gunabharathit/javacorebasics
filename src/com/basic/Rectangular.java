package com.basic;

public class Rectangular {
	double length;
	double breadth;
	double side;
	public Rectangular(double length,double breadth)
	{
		if(length>0.0&&length<20.0 && breadth>0.0&&length<20.0)
		{
			this.length=length;
			this.breadth=breadth;
		}
		else
		{
			System.out.println("sorry should between 0.0and20.0");
		}}
	
		public double findAreaofRectangular()
		{
			return length*breadth;
		}
	
	public static void main(String[] args)
	{
		Rectangular shape=new Rectangular(2,6);
		System.out.println(shape.findAreaofRectangular());
	}

}
