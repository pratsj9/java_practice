package inheritance;



public class Triangle extends Shape
{
	
	int length;
	 int breadth;
	static String type="Equilateral"; 
	
	
	public Triangle() 
	{
	
	super("Square",40.5f);
	System.out.println("\n\tInside Derived Class Default Constructor");
	
	}


public static void main(String[] args) 
	{
	
	//new Triangle();
	Triangle[] t1 =	new Triangle[2];
	t1[0]=new Triangle();
	t1[0].length=45;
	t1[0].breadth=50;
	System.out.println("\n\tTriangle Details :");
	System.out.println("\n\tLength:"+t1[0].length);
	System.out.println("\n\tBreadth:"+t1[0].breadth);
	System.out.println("\n\tTriangle Type:"+type+" (Static Value)");
	
	}
}

