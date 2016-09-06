package inheritance;

public class Shape {

	String name;
	float area;
	
	
	public Shape(String x,float d)
	{
	name=x;
	area=d;
	System.out.println("\nInside Parameterized Constructor of Super Class:");
	System.out.println("\n\tShape is:"+name);
	System.out.println("\n\tArea is:"+area+" Sq.m");
	}
	
	public Shape() 
	{
		System.out.println("\nInitialized Default Super Class Constructor");	
	}



}

