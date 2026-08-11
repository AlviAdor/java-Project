package LoginClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Homepage.*;
import Registration.*;

public class Login extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1;
		JButton b1,b2, b3, b4; 
		JPanel p1,p2;
		JPasswordField t2;
		
		
	public Login()
	{
		super(" Login Page ");
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
		p2.setBackground(Color.pink);
		p2.setLayout(null);
		
		l3 = new JLabel("Password: ");
		l3.setFont(new Font("Times New Roman",Font.BOLD,17));
		l3.setForeground(Color.white);
		l3.setBounds(250,300,150,20);
		p2.add(l3);
		
		
//		id = new JTextField();
//		id.setBounds(220,100,100,25);
//		p2.add(id);

		
		
//		b1 = new JButton("");
//		b1.setFont(new Font("Times New Roman",Font.BOLD,15));
//		b1.setForeground(Color.green);
//		b1.setBounds(180,520,100,25);
//		p2.add(b1);
		
		
	    
		l2 = new JLabel("User Id: ");
		l2.setFont(new Font("Times New Roman",Font.BOLD,17));
		l2.setForeground(Color.white);
		l2.setBounds(250,230,400,80);
		p2.add(l2);
		
		t1 = new JTextField();
		t1.setBounds(350,255,180,30);
		p2.add(t1);
		
		l4 = new JLabel();
		l4.setFont(new Font("Times New Roman",Font.BOLD,20));
		l4.setForeground(Color.white);
		l4.setBounds(180,300,150,20);
		p2.add(l4);
		
		b2 = new JButton("Login");
		b2.setFont(new Font("Times New Roman",Font.BOLD,17));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(330,360,200,30);
		b2.addActionListener(this);
		p2.add(b2);	
		
		b3 = new JButton("Registration");
		b3.setFont(new Font("Times New Roman",Font.BOLD,17));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(330,400,200,30);
		b3.addActionListener(this);
		p2.add(b3);	
		
		b4 = new JButton("EXIT");
		b4.setFont(new Font("Times New Roman",Font.BOLD,20));
		b4.setForeground(Color.white);
		b4.setBackground(Color.red);
		b4.setBounds(680,530,100,30);
		b4.addActionListener(this);
		p2.add(b4);	
		
		
		t2 = new JPasswordField();
		t2.setBounds(350,300,180,30);
		p2.add(t2);
		
        this.add(p1);		
        this.add(p2);
	}

		public void actionPerformed(ActionEvent ae)
		{
			String id = t1.getText();        //get user entered username from the textField1  
            String pass = t2.getText();        //get user entered pasword from the textField2  
          
        //check whether the credentials are authentic or not  
            if (id.equals("test1") && pass.equals("test")) {  //if authentic, navigate user to a new page  
              
            //create instance of the NewPage  
                Homepage h = new Homepage();
				this.setVisible(false);
				h.setVisible(true);  
        }  
        
			else if(ae.getSource()==b4)
			{
				System.exit(0);
			}
			else if(ae.getSource()==b3)
			{
				Registration r = new Registration();
				this.setVisible(false);
				r.setVisible(true);
			}
			else{  
            //show error message  
            System.out.println("Please enter valid username and password");  
        }  
			
		}


}














