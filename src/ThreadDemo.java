import java.util.Scanner;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No:");
		int n=sc.nextInt();
		Thread t1=new Fibothread(n);
		
		t1.start();
		
		
	}

}
