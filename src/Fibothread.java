
public class Fibothread extends Thread
{
	int n,fno=0,sno=1;
	
	public Fibothread(int n) {
		// TODO Auto-generated constructor stub
		this.n=n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub\
		System.out.print(fno+"\t"+sno+"\t");
	      for(int i=2;i<n;i++)
	      {
	    	   int thr=fno+sno;
	    	  System.out.print(thr+"\t");
	    	  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  fno=sno;
	    	  sno=thr;
	    	  if(i==5)
	    	  {
	    		  Thread t2=new Factothread(thr);
	    		  t2.start();
	    	  }
	      }
	      System.out.println("\n");
	}
}
