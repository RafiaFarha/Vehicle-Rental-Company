package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class Homepage extends JFrame implements ActionListener
{
	
	JLabel namelbl1;
	JButton backbtn;
	JPanel panel;
	FrameIntro f1;
	
	public Homepage(String s1,FrameIntro f1)
	{
		super("Homepage");
		this.setSize(800,450);
		this.setLocationRelativeTo(null);
		
		this.f1=f1;
		
		panel=new JPanel();
		panel.setLayout(null);
		
		namelbl1=new JLabel("Name"+" "+s1);
		namelbl1.setBounds(200,100,100,50);
		panel.add(namelbl1);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(300,200,100,50);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		this.setVisible(false);
		FrameIntro f1=new FrameIntro();
		f1.setVisible(true);
	}
	
	
}