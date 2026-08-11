package Articles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import LoginClass.*;
import Homepage.*;

public class Article1 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1;
		JTextArea t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12; 
		JPanel p1,p2,p3,p4;
		JScrollPane s1,s2;
		Login id;
		
	public Article1()
	{
		super(" Article 1 ");
		this.setSize(815,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,80));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(900,120));
		Color c1= new Color(0,162,232);
		p2.setBackground(c1);
		p2.setLayout(null);
		
		l1 = new JLabel("Wordpress");
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(330,30,300,30);
		p1.add(l1);												 
		
		l3 = new JLabel("Welcome, "+this.id);
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,9));
		l3.setForeground(Color.white);
		l3.setBounds(715,10,150,20);
		p1.add(l3);
		
		b4 = new JButton("Logout");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,7));
		b4.setForeground(Color.black);
		b4.setBackground(Color.red);
		b4.setBounds(715,30,60,15);
		b4.addActionListener(this);
		p1.add(b4);
		
        
		p3 = new JPanel();
		p3.setSize(new Dimension(900,120));
		p3.setBackground(Color.white);
		p3.setLayout(null);
		
        l5 = new JLabel("Introducing Java");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		l5.setForeground(Color.black);
		l5.setBounds(20,130,150,20);
		p3.add(l5);
		
		l7 = new JLabel("JAVA was developed by James Gosling at Sun Microsystems Inc in the year 1995,\n later acquired by Oracle Corporation. \n It is a simple programming language. \n Java makes writing, compiling, and debugging programming easy. \n It helps to create reusable code and modular programs. \n Java is a class-based, \n object-oriented programming language and is designed to have as few implementation dependencies as possible. \n A general-purpose programming language made for developers to write once run anywhere that is compiled Java code can run on all platforms that support Java. \n Java applications are compiled to byte code that can run on any Java Virtual Machine. \n The syntax of Java is similar to c/c++. \n History: Java’s history is very interesting. \n It is a programming language created in 1991. /n James Gosling, Mike Sheridan, and Patrick Naughton, a team of Sun engineers known as the Green team initiated the Java language in 1991. \n Sun Microsystems released its first public implementation in 1996 as Java 1.0. \n It provides no-cost -run-times on popular platforms. /n Java1.0 compiler was re-written in Java by Arthur Van Hoff to strictly comply with its specifications. \n With the arrival of Java 2, new versions had multiple configurations built for different types of platforms.");
		l7.setFont(new Font("Comic Sans MS",Font.BOLD,9));
		l7.setBackground(Color.white);
		//l7.setBounds(40,300,150,20);
		l7.setLayout(new BorderLayout());
		//p3.add(l7);
		s2 = new JScrollPane(l7);
		s2.setBounds(20,150,775,320);
		p3.add(s2);
		
		l6 = new JLabel("Comment");
		l6.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l6.setForeground(Color.black);
		l6.setBounds(40,520,150,20);
		p3.add(l6);
	
		t2 = new JTextArea();
		t2.setLineWrap(true);
		t2.setWrapStyleWord(true);
		t2.setFont(new Font("Ariel",Font.PLAIN,15));
		//t2.setBounds(120,480,140,50);
		
		s1 = new JScrollPane(t2);
		s1.setBounds(120,520,300,60);
		p3.add(s1);
	
		b3 = new JButton("Home");
		b3.setFont(new Font("Times New Roman",Font.BOLD,15));
		b3.setForeground(Color.black);
		b3.setBounds(10,90,75,20);
		b3.addActionListener(this);
		p2.add(b3);
				
				
        this.add(p1);		
        this.add(p2);
		this.add(p3);
		
		  

          

	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b3)
			{
				Homepage h = new Homepage();
				this.setVisible(false);
				h.setVisible(true);
			}
		     else if(ae.getSource()==b4)
			{
				Login lo = new Login();
				this.setVisible(false);
				lo.setVisible(true);
			}
		}	


}
