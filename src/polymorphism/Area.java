package polymorphism;

public class Area {
float length;
float breadth;

	

public void calc_area(float l,float b)
{
	length=l;
	breadth=b;
	System.out.println("----------Compile Time Polymorphism---------");
	System.out.println("\n\tInside Base Class Rectangle Calc Method");
	System.out.println("\n\tArea of Rectangle is:");
	System.out.println("\n\t"+(l*b)+" Sq.M");

}

}
