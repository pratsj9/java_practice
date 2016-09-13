package call_by;

public class Reference {
	
	int id;
	String name;
	
	public void caller(Reference r1)
	{

	System.out.println("\n\tPrinting from Called Object");	
	System.out.println("\n\tID:"+r1.id);
	System.out.println("\n\tName:"+r1.name);
		
	}

	public static void main(String[] args) {
		
		Reference obj = new Reference();
		obj.id = 1001;
		obj.name = "XYZ";
		
		System.out.println("\n\t Calling Method and passing object as parameter");
		obj.caller(obj);
		
	}

}
