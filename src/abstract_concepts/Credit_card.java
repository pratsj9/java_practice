package abstract_concepts;

import java.util.Scanner;

public class Credit_card extends Payment {
	
	String med;
	int amt;
	int cvv_no;
	String add;

	@Override
	public void pay_trans(String medium, int amount, String addr) {
		Scanner scn = new Scanner(System.in);
		med = medium;
		amt = amount;
		add = addr;
		System.out.println("\n\t Payment Medium is:"+med);
		System.out.println("\n\t Amount payable is:"+amt);
		System.out.println("\n\t Enter Your Credit Card CVV No");
		cvv_no=scn.nextInt();
		System.out.println("\n\t Product will be Delivered to"+add+" Location");
	
	}


	public static void main(String[] args) {
		Credit_card c1 = new Credit_card();
		c1.pay_trans("Credit Card", 8000, "Mumbai");

	}



}
