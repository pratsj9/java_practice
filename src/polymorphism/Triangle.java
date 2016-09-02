package polymorphism;

public class Triangle extends Rectangle {
	float base;
	float height;
	
	public void calc_area(float b,float h)
	{
	base = b;
	height=h;
	System.out.println("\n\t----------Run Time Polymorphism---------");
	System.out.println("\n\tInside Triangle Class overriden calc method:");
	System.out.println("\n\tArea of Triangle is:");
	System.out.println("\n\t"+(0.5)*b*h+" Sq.M");
	}
	


	public static void main(String args[])
	{
	Rectangle t1 = new Triangle();     //Up-casting
	Rectangle a1=new Rectangle();
	
	a1.calc_area(40, 35.7f);
	t1.calc_area(15,8.5f);
	}
}
