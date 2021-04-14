package com.akki.login;

public class COJ_03 
{
	private float real;
	private float imaginary;
	public COJ_03() {}
	public COJ_03(float f1, float f2)
	{
		this.real=f1;
		this.imaginary=f2;
	}
	
	@Override
	public String toString()
	{
		return "("+this.imaginary+","+this.real+")";
	}
	
	public static COJ_03 add (COJ_03 c1, COJ_03 c2)
	{
		return new COJ_03(c1.imaginary+c2.imaginary, c1.real+c2.real);
	}
	public static COJ_03 sub (COJ_03 c1, COJ_03 c2)
	{
		return new COJ_03(c1.imaginary-c2.imaginary, c1.real-c2.real);
	}
	public static void printComplex(COJ_03 c1)
	{
		System.out.println(c1.toString());
	}
	
	public static void main(String[] args) 
	{
		COJ_03 obj1 = new COJ_03(99.5f, 88.0f);
		COJ_03 obj2 = new COJ_03(14.5f, 56.0f);
		COJ_03 obj3 = obj1.add(obj1, obj2);
		COJ_03 obj4=obj1.sub(obj2, obj3);
		obj3.printComplex(obj4);
	}

}
