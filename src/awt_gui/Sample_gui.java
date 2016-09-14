package awt_gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Sample_gui extends Frame  {
	
	
	public Sample_gui() 
	{
		final Frame f1 = new Frame();
		final TextField t1 = new TextField();
		final TextField t2 = new TextField();
		final TextField t3= new TextField();
		Button b1 = new Button();
		b1.setLabel("Click!");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				t3.setText(t1.getText()+" "+t2.getText());
				
			
			}
		});
		
		f1.setSize(650, 650);
		b1.setBounds(80,40,50,50);
		t1.setBounds(150, 40,120, 100);
		t2.setBounds(150, 140, 120,100);
		t3.setBounds(150, 240, 120,100);
		
		f1.add(b1);
		f1.add(t1);
		f1.add(t2);
		f1.add(t3);
		f1.setLayout(null);
		f1.setVisible(true);
		
		
		
	}

	
	
	
	public static void main(String[] args) {
		

	new Sample_gui();
	}



}
