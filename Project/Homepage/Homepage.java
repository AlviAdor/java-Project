package Homepage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Articles.*;
import LoginClass.*;

public class Homepage extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12; 
		JPanel p1,p2,p3,p4;
		Login id;
		
	public Homepage()
	{
		super(" Home ");
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
	

		l3 = new JLabel("Welcome, "+id);
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,9));
		l3.setForeground(Color.gray);
		l3.setBounds(715,10,150,20);
		p1.add(l3);
		
		b4 = new JButton("Logout");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,7));
		b4.setForeground(Color.black);
		b4.setBackground(Color.red);
		b4.setBounds(715,30,60,15);
		b4.addActionListener(this);
		p1.add(b4);
		
//		t1 = new JTextField();
//		t1.setBounds(220,100,100,25);
//		p2.add(t1);

//		t2 = new JTextField();
//		t2.setBounds(220,150,100,25);
//		p2.add(t2);
		
//		b1 = new JButton("Add");
//		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
//		b1.setForeground(Color.green);
//		b1.setBounds(180,220,100,25);
		//b1.addActionListener(this);
//		p2.add(b1);
	
		b3 = new JButton("Home");
		b3.setFont(new Font("Times New Roman",Font.BOLD,15));
		b3.setForeground(Color.gray);
		b3.setBounds(10,90,75,20);
		b3.addActionListener(this);
		p2.add(b3);
				
		p3 = new JPanel();
		p3.setSize(new Dimension(900,120));
		p3.setBackground(Color.white);
		p3.setLayout(null);
		
		b5 = new JButton("Article 1");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b5.setForeground(Color.gray);
		b5.setBackground(Color.black);
		b5.setBounds(20,140,175,200);
		b5.addActionListener(this);
		p3.add(b5);
		
		b6 = new JButton("Article 2");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b6.setForeground(Color.gray);
		b6.setBackground(Color.black);
		b6.setBounds(215,140,175,200);
		b6.addActionListener(this);
		p3.add(b6);
		
		b7 = new JButton("Article 3");
		b7.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b7.setForeground(Color.gray);
		b7.setBackground(Color.black);
		b7.setBounds(410,140,175,200);
		b7.addActionListener(this);
		p3.add(b7);
		
		b8 = new JButton("Article 4");
		b8.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b8.setForeground(Color.gray);
		b8.setBackground(Color.black);
		b8.setBounds(605,140,175,200);
		b8.addActionListener(this);
		p3.add(b8);
		
		b9 = new JButton("Article 5");
		b9.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b9.setForeground(Color.gray);
		b9.setBackground(Color.black);
		b9.setBounds(20,360,175,200);
		b9.addActionListener(this);
		p3.add(b9);
		
		b10 = new JButton("Article 6");
		b10.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b10.setForeground(Color.gray);
		b10.setBackground(Color.black);
		b10.setBounds(215,360,175,200);
		b10.addActionListener(this);
		p3.add(b10);
		
		b11 = new JButton("Article 7");
		b11.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b11.setForeground(Color.gray);
		b11.setBackground(Color.black);
		b11.setBounds(410,360,175,200);
		b11.addActionListener(this);
		p3.add(b11);
		
		b12 = new JButton("Article 8");
		b12.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b12.setForeground(Color.gray);
		b12.setBackground(Color.black);
		b12.setBounds(605,360,175,200);
		b12.addActionListener(this);
		p3.add(b12);
		
//		p4 = new JPanel();
//		p4.setSize(new Dimension(900,200));
//        p4.setBounds(20,120,75,20);
//		Color c2= new Color(0,162,232);
//		p4.setBackground(Color.gray);
//		p4.setLayout(null);
	    
		l4 = new JLabel();
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l4.setForeground(Color.white);
		l4.setBounds(180,300,150,20);
		p3.add(l4);
		
//		b2 = new JButton("Next");
//		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
//		b2.setForeground(Color.white);
//		b2.setBackground(Color.green);
//		b2.setBounds(330,320,80,30);
		//b2.addActionListener(this);
//		p3.add(b2);	
		
        this.add(p1);		
        this.add(p2);
		this.add(p3);
//		this.add(p4);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b3)
			{
				Homepage h = new Homepage();
				this.setVisible(false);
				h.setVisible(true);
			}
			else if(ae.getSource()==b5)
			{
				Article1 f = new Article1();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b6)
			{
				Article2 f = new Article2();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b7)
			{
				Article3 f = new Article3();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b8)
			{
				Article4 f = new Article4();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b9)
			{
				Article5 f = new Article5();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b10)
			{
				Article6 f = new Article6();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b11)
			{
				Article7 f = new Article7();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b12)
			{
				Article8 f = new Article8();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				Login lo = new Login();
				this.setVisible(false);
				lo.setVisible(true);
			}
		}


}














