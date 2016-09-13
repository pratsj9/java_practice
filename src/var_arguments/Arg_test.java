package var_arguments;

public class Arg_test {
	String name;
	
	public void arg1(String...s)
	{
		 //Trying to print directly
		for(String i:s)
		{
			System.out.println(i);	
			
		}
		

	}
	

	public static void main(String[] args) {
		
		Arg_test a1 = new Arg_test();
		a1.arg1("XYZ","ABC","PQR");

	}

}
