package com.basic;

public interface IProject1 {
	
	public void featureOne();
	public void featuretwo();


	
public static void main(String[] args)
{
	SubPro obj=new SubPro();
	obj.featureOne();
}}
class SubPro implements IProject1{

	

	@Override
	public void featureOne() {
		
		
	}

	@Override
	public void featuretwo() {
	
		
	}
	
}