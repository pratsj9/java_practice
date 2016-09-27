package multithreading;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class Thread_Sample extends JFrame implements Runnable
{
	public JButton b1;
	public JButton b2;
	public JTextArea tf1;
	public JTextArea tf2;
	public Thread_Sample() 
	{
		
		setLayout(null);
		b1 = new JButton("First");
		b2 = new JButton("Second");
		
		tf1 = new JTextArea();
		tf2 = new JTextArea();
		
		b1.setBounds(50,100, 150, 50);
		tf1.setBounds(250, 100, 150, 150);
		
		b2.setBounds(50,250, 150, 50);
		tf2.setBounds(250,250, 150, 150);
		
		add(tf1);add(tf2);add(b1);add(b2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(700,700);
		
			
		

	}
		@Override
	public void run() 
	{
	
	
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i=0;i<5;i++){
					tf1.append((String.valueOf(i)));
					
					
					
					}
				}});
			
			b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			
					
	}

	public static void main(String[] args) 
	{
		Thread_Sample s1 = new Thread_Sample();
		Thread_Sample s2 = new Thread_Sample();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();	
		t2.start();
		
		

	}

}
