//Program implementing a static variable alongwith Array of objects and object count

package static_concepts;

import java.util.Scanner;

public class Displayer {
	
	static int count=0;
	int id;
	String name;
	
	public  Displayer() 
	{
	System.out.println("Default Constructor Initialized---Object Count:-"+(++count));
	}	

	public static void disp()
	{
	System.out.println("\n\t Also Displaying from the static method Disp");	
	}
	
	public void display()
	{
		System.out.println("\n\t ID:");
		System.out.println("\t"+id);
		System.out.println("\n\t Name:");
		System.out.println("\t"+name);
	 }
	

public static void main(String args[])
{

	Displayer[] d = new Displayer[10];
	Scanner scn = new Scanner(System.in);
	int ch;
	System.out.println("\nEnter the number of Records: Max Limit 10");
	ch=scn.nextInt();
	for(int i=0;i<ch;i++)
	{
		d[i]=new Displayer();
	}
	System.out.println("\n\tEnter "+count+" Data values:");
	
	for(int i=0;i<count;i++)
	{
		System.out.println("\n\t Enter ID:");
		d[i].id=scn.nextInt();
		System.out.println("\n\t Enter Name:");
		d[i].name=scn.next();
	}
	
	for(int i=0;i<count;i++)
	{
		d[i].display();
	}
	 
		System.out.println("\n\tFinal Object Count value:"+count);
		Displayer.disp();
		scn.close();
	}


}
