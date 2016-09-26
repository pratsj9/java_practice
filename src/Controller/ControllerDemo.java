package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Modifier;

import javax.swing.JOptionPane;

import Model.*;
import View.*;


public class ControllerDemo implements ActionListener 
{
	ViewDemo v1 = new ViewDemo();
	public ControllerDemo(ViewDemo v1) 
	{
		this.v1 = v1;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int num1 = Integer.parseInt(v1.tf1.getText());
		int num2 = Integer.parseInt(v1.tf2.getText());
		Modeldemo m1 = new Modeldemo();
		
		if(e.getSource()==v1.addition)
		{ 
		
			int res= m1.adder(num1,num2);
			JOptionPane.showMessageDialog(null,"Result:"+res);
		
		
		}
		else if(e.getSource()==v1.sub)
		{
			int res=m1.sub(num1, num2);
			JOptionPane.showMessageDialog(null,"Result:"+res);
			
		}
		else
		{
			v1.tf1.setText("");
			v1.tf2.setText("");
			
		}
		
		
		
	}


}
