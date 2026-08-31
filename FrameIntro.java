package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class FrameIntro extends JFrame implements MouseListener,ActionListener
{
	
	JLabel namelbl,passlbl,imglbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton logbtn,signbtn,backbtn;
	JPanel panel;
	Color mycolor,mycolor1;
	Font myfont;
	ImageIcon img;
	
	public FrameIntro()
	{
		super("My First Frame");
		this.setSize(850,450);
		this.setLocationRelativeTo(null);
		
		mycolor=new Color(75,201,204);
		mycolor1=new Color(245,148,198);
		
		myfont=new Font("Cambria",Font.PLAIN,22);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		panel.setBackground(mycolor);
		//panel.setBackground(Color.RED);
		
		
		namelbl=new JLabel("Name");
		namelbl.setBounds(200,100,100,50);
		namelbl.setBackground(mycolor1);
		namelbl.setOpaque(true);
		namelbl.setFont(myfont);
		panel.add(namelbl);
		
		namefld=new JTextField();
		namefld.setBounds(300,100,200,50);
		panel.add(namefld);
		
		passlbl=new JLabel("Password");
		passlbl.setBounds(200,180,100,50);
		panel.add(passlbl);
		
		passfld=new JPasswordField();
		passfld.setBounds(300,180,200,50);
		passfld.setEchoChar('#');
		panel.add(passfld);
		
		logbtn=new JButton("Login");
		logbtn.setBounds(190,250,100,50);
		logbtn.setBackground(mycolor1);
		logbtn.addMouseListener(this);
		logbtn.addActionListener(this);
		panel.add(logbtn);
		
		signbtn=new JButton("SignUp");
		signbtn.setBounds(320,250,100,50);
		signbtn.setBackground(Color.RED);
		signbtn.setForeground(Color.WHITE);
		signbtn.addMouseListener(this);
		signbtn.addActionListener(this);
		panel.add(signbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(450,250,100,50);
		backbtn.setBackground(Color.BLUE);
		backbtn.addMouseListener(this);
		panel.add(backbtn);
		
		img=new ImageIcon("./Images/oop1M.jpg");
		imglbl=new JLabel(img);
		imglbl.setBounds(0,0,850,450);
		panel.add(imglbl);
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==logbtn)
		{
			logbtn.setBackground(Color.WHITE);
			logbtn.setForeground(Color.CYAN);
		}
		else if(me.getSource()==signbtn)
		{
			signbtn.setBackground(Color.WHITE);
			signbtn.setForeground(Color.CYAN);
		}
		else if(me.getSource()==backbtn)
		{
			backbtn.setBackground(Color.WHITE);
			backbtn.setForeground(Color.CYAN);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==logbtn)
		{
			logbtn.setBackground(mycolor1);
			logbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==signbtn)
		{
			signbtn.setBackground(Color.RED);
			signbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==backbtn)
		{
			backbtn.setBackground(Color.BLUE);
			backbtn.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==signbtn)
		{
			this.setVisible(false);
			Register r1=new Register();
			r1.setVisible(true);
		}
		else if(ae.getSource()==logbtn)
		{
			String s1=namefld.getText();
			String s2=passfld.getText();
			
			if(s1.isEmpty()||s2.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill Up All");
			}
			
			else
			{
				Account a1=new Account();
				if(a1.getAccount(s1,s2)==true)
				{
					this.setVisible(false);
					Homepage h1=new Homepage(s1,this);
					h1.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Not ok");
				}
				
			}
			
		}
	}
	
}