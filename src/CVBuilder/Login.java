package CVBuilder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Login extends JFrame implements ActionListener{

	JLabel l1,l2,l3,l4;
	JPasswordField p1;
	JButton b1,b2;
	JTextField tf1;
	
	public Login()
	{
		l1= new JLabel("Log In");
		l1.setBounds(115,10,150,40);
		l1.setFont(new Font("Raleway",Font.BOLD,30));
		l1.setBorder(new BevelBorder(BevelBorder.RAISED));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setForeground(Color.red);
		l1.setBackground(Color.magenta);
		add(l1);
		
		l2 = new JLabel("UserName :");
		l2.setBounds(30, 90, 120, 30);
		l2.setFont(new Font("Raleway",Font.BOLD,20));
		add(l2);
		
		l3 =  new JLabel("Password :");
		l3.setBounds(30,150,120,30);
		l3.setFont(new Font("Raleway",Font.BOLD,20));
		add(l3);
		
		b1= new JButton("LogIn");
		b1.setBounds(50, 220, 120, 30);
		b1.setFont(new Font("Raleway",Font.BOLD,20));
		b1.setBackground(Color.orange);
		add(b1);
		
		b2 = new JButton("Cancel");
		b2.setBounds(200, 220, 120, 30);
		b2.setFont(new Font("Raleway",Font.BOLD,20));
		b2.setBackground(Color.orange);
		add(b2);
		
		tf1 = new JTextField();
		tf1.setBounds(180, 97, 150, 20);
		tf1.setFont(new Font("Raleway",Font.PLAIN,15));
		add(tf1);
		
		p1 = new JPasswordField();
		p1.setBounds(180, 155, 150, 20);
		p1.setFont(new Font("Raleway",Font.PLAIN,15));
		add(p1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		p1.addActionListener(this);
		
		getContentPane().setBackground(Color.GREEN);
		setTitle(" LOG IN ");
		setLocation(400, 100);
		setSize(400, 350);
		setLayout(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1 || ae.getSource()==p1)
		{
			char[] c= {'a','v','n','e','e','t','2','0','@'};
			char[] password = p1.getPassword();
			
			if(tf1.getText().equals("avneet21") && Arrays.equals(c, password))
			{
				new HomePage().setVisible(true);
			}
			
		}
		else 
		{
	
			if(JOptionPane.showConfirmDialog(null,"Do you want to exit")==0)
				{
				System.exit(0);
				}
		}
		
	}
	public static void main(String[] args){
		new Login().setVisible(true);
	}

}