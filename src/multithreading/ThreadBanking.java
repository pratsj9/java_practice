package multithreading;

public class ThreadBanking  
{
public static int balance=1000;

synchronized public void withdraw(int amt)
{
	System.out.println("\n---------------Withdraw Operation--------------");
		
	if(balance<amt) 
	{	System.out.println("\n\tError Not enough balance to withdraw Please Deposit First");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
	}
	if(balance>amt)
	{
		balance=balance-amt;
		System.out.println("\n\t Withdraw Successfull--- Current Balance:"+balance);
	}

}

synchronized public void deposit(int amt)
{
	System.out.println("\n------------------Deposit operation------------");
	
	balance=balance+amt;
	System.out.println("\n\tAmount Deposited is:"+amt+"\n\t Latest Balance:"+balance);
	notify();

}


}

class Runner
{
	
	public static void main(String args[])
	{
		final ThreadBanking t1 = new ThreadBanking();
		new Thread(){
			@Override
			public void run() 
			{
				t1.withdraw(2000);
			}}.start();
	
	
			new Thread(){
				public void run() 
				{
				t1.deposit(3000);	
				};
			}.start();
	
	}
	


}
