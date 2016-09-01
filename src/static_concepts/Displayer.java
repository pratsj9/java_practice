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
		System.out.println(id);
		System.out.println("\n\t Name:");
		System.out.println(name);
	}
	

public static void main(String args[])
{

	Displayer[] d = new Displayer[5];
	Scanner scn = new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		d[i]=new Displayer();
	}
	System.out.println("\n\tEnter 3 Data values:");
	for(int i=0;i<3;i++)
	{
		System.out.println("\n\tEnter ID:");
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
