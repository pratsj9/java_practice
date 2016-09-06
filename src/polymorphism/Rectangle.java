//This is a simple program to work on the Concept of COmpile time and Runtime Polymorphism
//Rectangle is the Base class and Triangle Derives it and overloads its calc_area method
package polymorphism;

public class Rectangle {
float length;
float breadth;

	

public void calc_area(float l,float b)
{
	length=l;
	breadth=b;
	System.out.println("\n\t----------Compile Time Polymorphism---------");
	System.out.println("\n\tInside Base Class Rectangle Calc Method");
	System.out.println("\n\tArea of Rectangle is:");
	System.out.println("\n\t"+(l*b)+" Sq.M");
}





}
