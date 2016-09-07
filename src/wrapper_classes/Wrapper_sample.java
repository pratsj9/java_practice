
//Practicing some wrapper classes and passing some default and incorrect inputs to them to see how they print their output
package wrapper_classes;

public class Wrapper_sample {


public static void main(String args[])
{

	System.out.println("\n\t-------Wrapper Classes------");
	Integer i1 = new Integer(45);
	System.out.println("\n\tPrinting wrapper Integer Object:"+i1);
	int p1 = i1;
	System.out.println("\n\tPrinting wrapper Integer to Variable Conversion:"+p1);
	
	
	System.out.println("\n\t Printing Float object:");
	Float f1 = new Float(45);    //Notice that an integer value has been passed but it'll convert into a float
	System.out.println("\n\tFloat object value:"+f1);
	
	System.out.println("\n\t Printing Boolean value:");
	Boolean b1 = new Boolean(true);
	System.out.println("\n\tBoolean Object Value:"+b1);
	b1 = new Boolean("xyz");  		//This time a string value has been passed that is not true/false
	System.out.println("\n\t Boolean Object Value(String):"+b1);
	

	System.out.println("\n\t--------Parse Method---------");
	
	String str = "160";   			//Created a String containing a number
	int x = Integer.parseInt(str); 	//Passing the string as a parameter to ParseInt and convert it 
	System.out.println("\n\tConverted String Value to Int:"+x);		
			

	String str2 = Integer.toString(x);
	System.out.println("\n\t Converted Integer to String:"+str2);

}



}
