
public class Factothread extends Thread{
int n,fact;
public Factothread(int n) {
	// TODO Auto-generated constructor stub
	this.n=n;
	this.fact=1;
}
public void run() {
	// TODO Auto-generated method stub
     for(int i=1;i<=n;i++)
     {
    	 fact=fact*i;
     }
     System.out.println("Fact ="+fact);
     try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
