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
		Label username = new Label();
		Label passwd = new Label();
		Button b1 = new Button();
		
		
		b1.setLabel("Click!");
		username.setText("Username");
		passwd.setText("Password");
		
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t3.setText(t1.getText() +""+ t2.getText());
				
										
				}});
		
		//Frame and TextField Setup
		f1.setSize(650, 650);
		b1.setBounds(120,400,50,50);
		
		username.setBounds(50, 50, 120, 30);		
		passwd.setBounds(50, 100,120, 30);
		t1.setBounds(200,50, 120, 30);
		t2.setBounds(200,100, 120,30);
		t3.setBounds(250, 150, 120,30);
		
		
		
		//Adding all components to Frame
		f1.add(username);
		f1.add(passwd);
		f1.add(b1);
		f1.add(t1);
		f1.add(t2);
		f1.add(t3);
		
		//Set Frame Layout and make it visible
		f1.setLayout(null);
		f1.setVisible(true);
			
	}

	
	
	
	public static void main(String[] args) {
		new Sample_gui();}}
