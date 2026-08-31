package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import Entities.*;

public class Register extends JFrame implements ActionListener
{
	
	JLabel unamlbl,upasslbl;
	JPasswordField upassfld;
	JTextField unamfld;
	JPanel panel;
	JButton rgstrbtn,backbtn;
	
	public Register()
	{
		super("Registration");
		this.setSize(850,450);
		this.setLocationRelativeTo(null);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		unamlbl=new JLabel("Name");
		unamlbl.setBounds(200,100,100,50);
		panel.add(unamlbl);
		
		unamfld=new JTextField();
		unamfld.setBounds(300,100,200,50);
		panel.add(unamfld);
		
		upasslbl=new JLabel("Password");
		upasslbl.setBounds(200,180,100,50);
		panel.add(upasslbl);
		
		upassfld=new JPasswordField();
		upassfld.setBounds(300,180,200,50);
		upassfld.setEchoChar('#');
		panel.add(upassfld);
		
		rgstrbtn=new JButton("Signup");
		rgstrbtn.setBounds(280,250,100,50);
		rgstrbtn.addActionListener(this);
		panel.add(rgstrbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(400,250,100,50);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		this.add(panel);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String s1=unamfld.getText();
		String s2=upassfld.getText();
		
		if(ae.getSource()==rgstrbtn)
		{
			if(s1.isEmpty()||s2.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill Up All");
			}
			else
			{
				
				
				this.setVisible(false);
				FrameIntro f1=new FrameIntro();
				f1.setVisible(true);
			}
		}
		else if(ae.getSource()==backbtn)
		{
			this.setVisible(false);
			FrameIntro f1=new FrameIntro();
			f1.setVisible(true);
		}
	}
}