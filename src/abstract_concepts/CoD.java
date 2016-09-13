package abstract_concepts;

public class CoD extends Payment {

	int amt;
	String med;
	String add;
	
	@Override
	public void pay_trans(String medium, int amount,String address) 
	{
		amt=amount;
		med = medium;
		add = address;
		
		System.out.println("\n\t Payment Medium is:"+med);
		System.out.println("\n\t Amount payable is:"+amt);
		System.out.println("\n\t Product will be Delivered to "+add+" Location");
		
	}


	public static void main(String args[])
	{
		CoD c1 = new CoD();
		c1.pay_trans("Cash On Delivery", 4500,"Pune");

	}


}
