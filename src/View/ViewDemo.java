package View;
import javax.swing.JTextField;

import java.awt.GridLayout;


import javax.swing.*;

import Controller.*;

public class ViewDemo extends JFrame  {

	public JButton addition;
	public JButton sub;
	public JButton res;
	public JTextField tf1;
	public JTextField tf2;

	public ViewDemo()
	{
		setLayout(new GridLayout(3,2));
		tf1 = new JTextField();
		tf2 = new JTextField();
		ControllerDemo c1 = new ControllerDemo(this);
		
		addition = new JButton("ADD");
		sub = new JButton("SUBTRACT");
		res = new JButton("RESET");
		
		add(tf1);add(tf2);add(addition);add(sub);add(res);
	
		addition.addActionListener(c1);
		sub.addActionListener(c1);
		res.addActionListener(c1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		
		
			
		
	}
	
	public static void main(String ars[])
	{
		
		new  ViewDemo();
		
	}
	
	

}
