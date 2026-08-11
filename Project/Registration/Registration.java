package Registration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import LoginClass.*;

public class Registration extends JFrame implements ActionListener
{
    JTextField t1,t2,t3,t4,t5;
	//JPasswordField t2;
	JPanel p1,p2,p3;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6;
	JRadioButton r1,r2;
	//JComboBox c1,c2,c3;
	
	
	
	public Registration()
	{
		super(" Registration ");	
		this.setSize(815,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,80));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
			l1 = new JLabel("Wordpress");
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(330,30,300,30);
		p1.add(l1);
	
	    p2 = new JPanel();
		p2.setSize(new Dimension(900,620));
		p2.setBackground(Color.white);
		p2.setLayout(null);
		
		
		l1 = new JLabel(" Registration ");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(320,100,450,30);
		p2.add(l1);
		
		l2 = new JLabel("Enter your username : ");
		l2.setFont(new Font("Serif",Font.BOLD,16));
		l2.setForeground(Color.black);
		l2.setBounds(140,200,350,30);
		p2.add(l2);
		
		l4= new JLabel("Enter your Email Address : ");
		l4.setFont(new Font("Serif",Font.BOLD,15));
		l4.setForeground(Color.black);
		l4.setBounds(140,250,350,30);
		p2.add(l4);
		
		l3 = new JLabel("Enter your password : ");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		l3.setForeground(Color.black);
		l3.setBounds(140,300,350,30);
		p2.add(l3);
		
		t1 = new JTextField();
		t1.setBounds(330,200,150,30);
		p2.add(t1);
		
		t3 = new JTextField();
		t3.setBounds(330,250,150,30);
		p2.add(t3);
		
		t2 = new JPasswordField();
        t2.setBounds(330,300,150,30);
        p2.add(t2);	
		
	   
//        String Date[]={"1", "2", "3", "4", "5",
 //           "6", "7", "8", "9", "10",
//            "11", "12", "13", "14", "15",
//            "16", "17", "18", "19", "20",
//            "21", "22", "23", "24", "25",
//            "26", "27", "28", "29", "30",
//            "31"};        
//        final JComboBox c1=new JComboBox(Date);    
//        c1.setBounds(330, 400,90,20);    
//        c1.setLayout(null);
//		p2.add(c1);    
        
		
//		String month[]={ "Jan", "feb", "Mar", "Apr",
//          "May", "Jun", "July", "Aug",
//         "Sup", "Oct", "Nov", "Dec" };        
//    final JComboBox c2=new JComboBox(month);    
//  c2.setBounds(350,400,90,20);    
//    c2.setLayout(null);
//	p2.add(c1);    
        
		
//	String year[]={"1995", "1996", "1997", "1998",
//       "1999", "2000", "2001", "2002",
//     "2003", "2004", "2005", "2006",
//            "2007", "2008", "2009", "2010",
//        "2011", "2012", "2013", "2014",
//       "2015", "2016", "2017", "2018",
//       "2019"};        
//    final JComboBox c3=new JComboBox(year);    
//    c3.setBounds(370, 400,90,20);    
//    c3.setLayout(null);
//	p2.add(c3);    
        
		
		
		
		l5= new JLabel("Gender : ");
		l5.setFont(new Font("Serif",Font.BOLD,15));
		l5.setForeground(Color.black);
		l5.setBounds(140,350,350,30);
		p2.add(l5);

        ButtonGroup bg1 = new ButtonGroup();
        r1=new JRadioButton("Male");    
        r1.setBounds(330,350,100,30);      
        r2=new JRadioButton("Female");    
        r2.setBounds(430,350,100,30);       
        bg1.add(r1);bg1.add(r2);  
    
        l6= new JLabel("Date Of Birth : ");
		l6.setFont(new Font("Serif",Font.BOLD,15));
		l6.setForeground(Color.black);
		l6.setBounds(140,350,350,30);
		p2.add(l4);
		
        setLayout(null);  
        p2.add(r1);  		
        p2.add(r2);  		
		
		b2 = new JButton("Register");
		b2.setBounds(320,450,180,30);
		b2.setBackground(Color.green);
		p2.add(b2);
		b2.addActionListener(this);
		
		this.add(p1);
		this.add(p2);
	}		
		
		
		public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b2)
			{
				Login lo = new Login();
				this.setVisible(false);
				lo.setVisible(true);
			}
		else {  
            //show error message  
            System.out.println("Please enter valid username and password");  
        } 
		}
}