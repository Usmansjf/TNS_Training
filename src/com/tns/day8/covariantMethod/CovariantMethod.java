package com.tns.day8.covariantMethod;
//base class
class Color
{
	protected Color getColor()
	{
		
		Color s = new Color();
		return s;
		
		
	}

	@Override
	public String toString() {
		return "Color";
	}
}

class Red extends Color
{
	public Red getColor() 
	{
		
		Red s = new Red();
		
		return s;
		
		
		
	}

	@Override
	public String toString() {
		return "Red Color";
	}
}
public class CovariantMethod 
{
	public static void main(String[] args)
	{
		Color c1  =new Color();
		Color c2 = c1.getColor();
		System.out.println(c2);
		
		Red r1 = new Red();
		Color c3 = r1.getColor();
				System.out.println(c3);
		
	}
}
