package static_concepts;

public class Displayer {
	
	static int count=0;
	
	public  Displayer() 
	{
	System.out.println("Default Constructor Initialized---Object Count:-"+(++count));
	}	

	public static void disp()
	{
		
	System.out.println("Displaying from a static method");	
	}

public static void main(String args[])
{
	Displayer d1= new Displayer();
	Displayer d2= new Displayer();
	Displayer d3 = new Displayer();
	
	System.out.println("Final Object Count value:"+d2.count);
	Displayer.disp();
}


}
