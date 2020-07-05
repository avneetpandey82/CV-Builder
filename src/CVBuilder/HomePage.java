package CVBuilder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileSystemView;

public class HomePage extends JFrame implements ActionListener,MouseListener{//learn to add Mouse Listener
	
	static JFrame f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,dl1,dl2,dl3,dl4;
	JLabel l21,l22,l23,l24,l25,l26,l27;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,db1,db2;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,dt1,dt2,dt3;
	JTextField tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25,tf26,tf27,tf28,tf29,tf30;
	JTextField tf31,tf32,tf33,tf34,tf35,tf36,tf37,tf38,tf39,tf40,tf41,tf42,tf43,tf44;
	JTextField tf45,tf46,tf47,tf48,tf49,tf50,tf51,tf52,tf53,tf54,tf55,tf56,tf57,tf58,tf59;
	String degree,marks,college,yeargraduation;
	String grade12,school12,year12,grade10,school10,year10;
	JComboBox<String> cb1,cb2;
	JMenuBar mb = new JMenuBar();
	JMenu m1;JMenuItem item1,item2;
	
	String path = "C:\\Users\\hp pc\\eclipse-workspace\\Java CVBuilder\\pics";
	private int n=1,y;

	public HomePage() {

		setTitle("HomePage");
		m1=new JMenu("File");
		item1 = new JMenuItem("Attach Photo");
		item2= new JMenuItem("Save");
		m1.add(item1);
		m1.add(item2);
		mb.add(m1);
		mb.setBackground(Color.magenta);
		setJMenuBar(mb);
		
		l1= new JLabel();
		l1.setBorder(new BevelBorder(BevelBorder.RAISED));
		l1.setBounds(1100, 90, 180, 180);
		l1.setBackground(Color.BLUE);
		add(l1);
		
		l2 = new JLabel("Resume Builder");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setBounds(10, 10, 1340, 50);
		l2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		l2.setFont(new Font("Castellar",Font.BOLD,35));
		l2.setBackground(Color.red);
		l2.setForeground(Color.blue);
		add(l2);
		
		b1 = new JButton("Attach Image");
		b1.setBounds(1130, 290, 120, 30);
		Image img1 = new ImageIcon("C:\\Users\\Sanjay Pandey\\eclipse-workspace\\Java CV Builder\\pics\\attach.png").getImage().getScaledInstance(20, 15, Image.SCALE_DEFAULT);
		b1.setIcon(new ImageIcon(img1));
		b1.setBackground(Color.red);
		b1.setForeground(Color.cyan);
		b1.setBorder(new MatteBorder(2, 2, 2, 2, Color.green));
		add(b1);
		
		b2 = new JButton("Save");
		b2.setBounds(1130, 330, 120, 30);
		Image img2 = new ImageIcon("C:\\Users\\Sanjay Pandey\\eclipse-workspace\\Java CV Builder\\pics\\save.png").getImage().getScaledInstance(20, 15, Image.SCALE_DEFAULT);
		b2.setIcon(new ImageIcon(img2));
		b2.setBackground(Color.red);
		b2.setForeground(Color.cyan);
		b2.setBorder(new MatteBorder(2, 2, 2, 2, Color.green));
		add(b2);
		
		l3 = new JLabel("Name* :");
		l3.setBounds(30, 90, 150, 25);
		l3.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l3);
		
		
		tf1=new JTextField();
		tf1.setBounds(200, 93, 200, 20);
		add(tf1);
		
		l4 = new JLabel("DOB* :");
		l4.setBounds(30, 130, 150, 25);
		l4.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l4);
		
		tf2=new JTextField("");
		tf2.setBounds(200, 133, 200, 20);
		add(tf2);
		
		l5 = new JLabel("Gender* :");
		l5.setBounds(30, 170, 150, 25);
		l5.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l5);
		
		String arr[]= {"Select","Male","Female","Others"};
		
		cb1 = new JComboBox<String>(arr);
		cb1.setBounds(200, 173, 100, 20);
		add(cb1);
		
		l6 = new JLabel("Mail* :");
		l6.setBounds(600, 90, 150, 25);
		l6.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l6);
		
		tf3=new JTextField();
		tf3.setBounds(780, 93, 200, 20);
		add(tf3);
		
		l7 = new JLabel("Contact* :");
		l7.setBounds(600, 130, 150, 25);
		l7.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l7);
	
		tf4=new JTextField();
		tf4.setBounds(780, 133, 200, 20);
		add(tf4);
		
		l8 = new JLabel("Address* :");
		l8.setBounds(600, 170, 150, 25);
		l8.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l8);
		
		tf5=new JTextField();
		tf5.setBounds(780, 173, 200, 20);
		add(tf5);
		
		l9 = new JLabel("Education Qualifications");
		l9.setBounds(30, 210, 500, 50);
		l9.setFont(new Font("Times New Roman",Font.BOLD,40));
		l9.setForeground(Color.red);
		add(l9);
		
		l10 = new JLabel("Select Highest Education:");
		l10.setBounds(30, 280, 250, 25);
		l10.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l10);
		
		String high[]= {"Select","Bachelor","Post Graduate"};
		cb2= new JComboBox<String>(high);
		cb2.setBounds(300, 280, 250, 25);
		add(cb2);
		
		l11 = new JLabel("12th Grade* :");
		l11.setBounds(30, 320, 150, 25);
		l11.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l11);
		
		tf6=new JTextField();
		tf6.setBounds(170, 323, 50, 20);
		add(tf6);
		

		l11 = new JLabel("School* :");
		l11.setBounds(240, 320, 100, 25);				//l11 do baar use kiya h
		l11.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l11);
		
		tf7=new JTextField();
		tf7.setBounds(340,323, 180, 20);
		add(tf7);
		
		l24=new JLabel("Year* :");
		l24.setBounds(540, 320, 100, 25);
		l24.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l24);
		
		tf43 = new JTextField();
		tf43.setBounds(620, 323, 50, 20);
		add(tf43);
		
		l12 = new JLabel("10th Grade* :");
		l12.setBounds(30, 360, 150, 25);
		l12.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l12);
		
		tf8=new JTextField();
		tf8.setBounds(170, 363, 50, 20);
		add(tf8);
		
		l12 = new JLabel("School* :");
		l12.setBounds(240, 360, 100, 25);		//l12 bhi do baar use kiya...
		l12.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l12);
		
		tf9=new JTextField();
		tf9.setBounds(340, 363, 180, 20);
		add(tf9);
		

		l24=new JLabel("Year* :");
		l24.setBounds(540, 360, 100, 25);
		l24.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l24);
		
		tf44 = new JTextField();
		tf44.setBounds(620, 363, 50, 20);
		add(tf44);
			
		l13 = new JLabel("Certificates");
		l13.setBounds(30, 400, 500, 50);
		l13.setFont(new Font("Times New Roman",Font.BOLD,40));
		l13.setForeground(Color.red);
		add(l13);
		

		l14= new JLabel("Certificate 1 :");
		l14.setBounds(30, 460, 150, 25);
		l14.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l14);
		y=460;
			
		tf10=new JTextField("Title");
		tf10.setBounds(200, 463, 120, 20);
		tf10.setForeground(Color.lightGray);
		add(tf10);
		
		tf11=new JTextField("Platform");
		tf11.setBounds(350, 463, 120, 20);
		tf11.setForeground(Color.lightGray);
		add(tf11);
		
		tf12=new JTextField("Date of Completion");
		tf12.setBounds(500, 463, 120, 20);
		tf12.setForeground(Color.lightGray);
		add(tf12);
		
		b3 = new JButton("+");
		b3.setBounds(630,463,50,20);
		b3.setBackground(Color.yellow);
		add(b3);
		
		l19= new JLabel("Add new");
		l19.setBounds(685, 463, 150, 15);
		l19.setFont(new Font("Times New Roman",Font.PLAIN,15));
		l19.setForeground(Color.MAGENTA);
		add(l19);
		
		l19= new JLabel("certificate");
		l19.setBounds(685, 475, 150, 15);
		l19.setFont(new Font("Times New Roman",Font.PLAIN,15));
		l19.setForeground(Color.MAGENTA);
		add(l19);
		
		l19= new JLabel("one by one");
		l19.setBounds(685, 487, 100, 15);
		l19.setFont(new Font("Times New Roman",Font.PLAIN,15));
		l19.setForeground(Color.MAGENTA);
		add(l19);
		
		/*
		 * b1 = new JButton("Add"); b1.setBounds(660,463, 80, 20); b1.setFont(new
		 * Font("Times New Roman",Font.PLAIN,10)); add(b1);
		 */
		
		l19= new JLabel("Skills");
		l19.setBounds(700, 210, 500, 50);
		l19.setFont(new Font("Times New Roman",Font.BOLD,40));
		l19.setForeground(Color.red);
		add(l19);
		
		tf25=new JTextField();
		tf25.setBounds(730, 280, 100, 20);
		add(tf25);
		
		tf26=new JTextField();
		tf26.setBounds(850, 280, 100, 20);
		add(tf26);
		
		tf27 = new JTextField();
		tf27.setBounds(970, 280, 100, 20);
		add(tf27);
		
		tf28=new JTextField();
		tf28.setBounds(730, 320, 100, 20);
		add(tf28);
		
		tf29=new JTextField();
		tf29.setBounds(850, 320, 100, 20);
		add(tf29);
		
		tf30 = new JTextField();
		tf30.setBounds(970, 320, 100, 20);
		add(tf30);
		
		tf31=new JTextField();
		tf31.setBounds(730, 360, 100, 20);
		add(tf31);
		
		tf32=new JTextField();
		tf32.setBounds(850,360, 100, 20);
		add(tf32);
		
		tf33=new JTextField();
		tf33.setBounds(970, 360, 100, 20);
		add(tf33);
		
		l20 = new JLabel("Projects");
		l20.setBounds(760,400, 500, 50);
		l20.setFont(new Font("Times New Roman",Font.BOLD,40));
		l20.setForeground(Color.red);
		add(l20);
		
		l21= new JLabel("Project 1 :");
		l21.setBounds(760, 460, 150, 25);
		l21.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l21);
		
		tf34=new JTextField("Title");
		tf34.setBounds(890, 463, 150, 20);
		tf34.setForeground(Color.LIGHT_GRAY);
		add(tf34);
		
		tf35=new JTextField("Based On");
		tf35.setBounds(1060, 463, 150, 20);
		tf35.setForeground(Color.LIGHT_GRAY);
		add(tf35);
		
		tf36=new JTextField("Date Of Completion");
		tf36.setBounds(1230, 463, 150, 20);
		tf36.setForeground(Color.LIGHT_GRAY);
		add(tf36);
		
		l22= new JLabel("Project 2 :");
		l22.setBounds(760, 500, 150, 25);
		l22.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l22);
		
		tf37=new JTextField();
		tf37.setBounds(890, 503, 150, 20);
		add(tf37);
		
		tf38=new JTextField();
		tf38.setBounds(1060, 503, 150, 20);
		add(tf38);
		
		tf39=new JTextField();
		tf39.setBounds(1230, 503, 150, 20);
		add(tf39);
		
		l23= new JLabel("Project 3 :");
		l23.setBounds(760, 540, 150, 25);
		l23.setFont(new Font("Times New Roman",Font.PLAIN,23));
		add(l23);
		
		tf40=new JTextField();
		tf40.setBounds(890, 543, 150, 20);
		add(tf40);
		
		tf41=new JTextField();
		tf41.setBounds(1060, 543, 150, 20);
		add(tf41);
		
		tf42=new JTextField();
		tf42.setBounds(1230, 543, 150, 20);
		add(tf42);
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		cb2.addActionListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		tf10.addMouseListener(this);
		tf11.addMouseListener(this);
		tf12.addMouseListener(this);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		getContentPane().setBackground(Color.cyan);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b3) 
		{
			n++;
			y+=40;
			
			if(n==2)
			{
			l15= new JLabel("Certificate "+n+" :");
			l15.setBounds(30, y, 150, 25);
			l15.setFont(new Font("Times New Roman",Font.PLAIN,23));
			add(l15);
				
			tf13=new JTextField();
			tf13.setBounds(200, y+3, 120, 20);
			add(tf13);
			
			tf14=new JTextField();
			tf14.setBounds(350, y+3, 120, 20);
			add(tf14);
			
			tf15=new JTextField();
			tf15.setBounds(500, y+3, 120, 20);
			add(tf15);
			
			b4 = new JButton("Add");
			b4.setBounds(630,y+3,70,20);
			b4.setFont(new Font("Calibri",Font.PLAIN,10));
			b4.setBackground(Color.yellow);
			add(b4);
			
			b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Test.title2=tf13.getText();
					Test.platform2=tf14.getText();
					Test.date2=tf15.getText();
				}
			});
			
			
			}
			else if(n==3)
			{				
				l15= new JLabel("Certificate "+n+" :");
				l15.setBounds(30, y, 150, 25);
				l15.setFont(new Font("Times New Roman",Font.PLAIN,23));
				add(l15);
				
				tf16=new JTextField();
				tf16.setBounds(200, y+3, 120, 20);
				add(tf16);
				
				tf17=new JTextField();
				tf17.setBounds(350, y+3, 120, 20);
				add(tf17);
				
				tf18=new JTextField();
				tf18.setBounds(500, y+3, 120, 20);
				add(tf18);
				
				b5 = new JButton("Add");
				b5.setBounds(630,y+3,70,20);
				b5.setFont(new Font("Calibri",Font.PLAIN,10));
				b5.setBackground(Color.yellow);
				add(b5);
				
				b5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Test.title3=tf16.getText();
						Test.platform3=tf17.getText();
						Test.date3=tf18.getText();
					}
				});
			}
			else if(n==4)
			{
				
				l15= new JLabel("Certificate "+n+" :");
				l15.setBounds(30, y, 150, 25);
				l15.setFont(new Font("Times New Roman",Font.PLAIN,23));
				add(l15);
				
				tf19=new JTextField();
				tf19.setBounds(200, y+3, 120, 20);
				add(tf19);
				
				tf20=new JTextField();
				tf20.setBounds(350, y+3, 120, 20);
				add(tf20);
				
				tf21=new JTextField();
				tf21.setBounds(500, y+3, 120, 20);
				add(tf21);
				
				b6 = new JButton("Add");
				b6.setBounds(630,y+3,70,20);
				b6.setFont(new Font("Calibri",Font.PLAIN,10));
				b6.setBackground(Color.yellow);
				add(b6);
				
				b6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Test.title4=tf19.getText();
						Test.platform4=tf20.getText();
						Test.date4=tf21.getText();
					}
				});
			
			}
			else if(n==5)
			{				
				l15= new JLabel("Certificate "+n+" :");
				l15.setBounds(30, y, 150, 25);
				l15.setFont(new Font("Times New Roman",Font.PLAIN,23));
				add(l15);
				
				tf22=new JTextField();
				tf22.setBounds(200, y+3, 120, 20);
				add(tf22);
				
				tf23=new JTextField();
				tf23.setBounds(350, y+3, 120, 20);
				add(tf23);
				
				tf24=new JTextField();
				tf24.setBounds(500, y+3, 120, 20);
				add(tf24);
				
				b7 = new JButton("Add");
				b7.setBounds(630,y+3,70,20);
				b7.setFont(new Font("Calibri",Font.PLAIN,10));
				b7.setBackground(Color.yellow);
				add(b7);
				
				b7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Test.title5=tf22.getText();
						Test.platform5=tf23.getText();
						Test.date5=tf24.getText();
					}
				});

			}
			else if(n==6)
			{				
				l15= new JLabel("Certificate "+n+" :");
				l15.setBounds(30, y, 150, 25);
				l15.setFont(new Font("Times New Roman",Font.PLAIN,23));
				add(l15);
				
				tf45=new JTextField();
				tf45.setBounds(200, y+3, 120, 20);
				add(tf45);
				
				tf46=new JTextField();
				tf46.setBounds(350, y+3, 120, 20);
				add(tf46);
				
				tf47=new JTextField();
				tf47.setBounds(500, y+3, 120, 20);
				add(tf47);
				
				b8 = new JButton("Add");
				b8.setBounds(630,y+3,70,20);
				b8.setFont(new Font("Calibri",Font.PLAIN,10));
				b8.setBackground(Color.yellow);
				add(b8);
				
				b8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Test.title6=tf22.getText();
						Test.platform6=tf23.getText();
						Test.date6=tf24.getText();
					}
				});

			}
			else if(n==7)
			{				
				l15= new JLabel("Certificate "+n+" :");
				l15.setBounds(30, y, 150, 25);
				l15.setFont(new Font("Times New Roman",Font.PLAIN,23));
				add(l15);
				
				tf48=new JTextField();
				tf48.setBounds(200, y+3, 120, 20);
				add(tf48);
				
				tf49=new JTextField();
				tf49.setBounds(350, y+3, 120, 20);
				add(tf49);
				
				tf50=new JTextField();
				tf50.setBounds(500, y+3, 120, 20);
				add(tf50);
				
				b9 = new JButton("Add");
				b9.setBounds(630,y+3,70,20);
				b9.setFont(new Font("Calibri",Font.PLAIN,10));
				b9.setBackground(Color.yellow);
				add(b9);
				
				b9.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Test.title7=tf22.getText();
						Test.platform7=tf23.getText();
						Test.date7=tf24.getText();
					}
				});

			}
			else if(n==8)
			{				
				l15= new JLabel("Certificate "+n+" :");
				l15.setBounds(30, y, 150, 25);
				l15.setFont(new Font("Times New Roman",Font.PLAIN,23));
				add(l15);
				
				tf51=new JTextField();
				tf51.setBounds(200, y+3, 120, 20);
				add(tf51);
				
				tf52=new JTextField();
				tf52.setBounds(350, y+3, 120, 20);
				add(tf52);
				
				tf53=new JTextField();
				tf53.setBounds(500, y+3, 120, 20);
				add(tf53);
				
				b10 = new JButton("Add");
				b10.setBounds(630,y+3,70,20);
				b10.setFont(new Font("Calibri",Font.PLAIN,10));
				b10.setBackground(Color.yellow);
				add(b10);
				
				b10.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Test.title8=tf51.getText();
						Test.platform8=tf23.getText();
						Test.date8=tf24.getText();
					}
				});

			}
			else if(n==9)
			{				
				l15= new JLabel("Certificate "+n+" :");
				l15.setBounds(30, y, 150, 25);
				l15.setFont(new Font("Times New Roman",Font.PLAIN,23));
				add(l15);
				
				tf54=new JTextField();
				tf54.setBounds(200, y+3, 120, 20);
				add(tf54);
				
				tf55=new JTextField();
				tf55.setBounds(350, y+3, 120, 20);
				add(tf55);
				
				tf56=new JTextField();
				tf56.setBounds(500, y+3, 120, 20);
				add(tf56);
				
				b11 = new JButton("Add");
				b11.setBounds(630,y+3,70,20);
				b11.setFont(new Font("Calibri",Font.PLAIN,10));
				b11.setBackground(Color.yellow);
				add(b11);
				
				b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Test.title9=tf22.getText();
						Test.platform9=tf23.getText();
						Test.date9=tf24.getText();
					}
				});

			}
			else if(n==10)
			{				
				l15= new JLabel("Certificate "+n+" :");
				l15.setBounds(30, y, 150, 25);
				l15.setFont(new Font("Times New Roman",Font.PLAIN,23));
				add(l15);
				
				tf57=new JTextField();
				tf57.setBounds(200, y+3, 120, 20);
				add(tf57);
				
				tf58=new JTextField();
				tf58.setBounds(350, y+3, 120, 20);
				add(tf58);
				
				tf59=new JTextField();
				tf59.setBounds(500, y+3, 120, 20);
				add(tf59);
				
				b12 = new JButton("Add");
				b12.setBounds(630,y+3,70,20);
				b12.setFont(new Font("Calibri",Font.PLAIN,10));
				b12.setBackground(Color.yellow);
				add(b12);
				
				b7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Test.title10=tf22.getText();
						Test.platform10=tf23.getText();
						Test.date10=tf24.getText();
					}
				});

			}
			revalidate();
			repaint();
		}
		else if(ae.getSource()==item1 || ae.getSource()==b1 )
		{
			
			JFileChooser fc = new JFileChooser(path);
			int r = fc.showOpenDialog(null);
			if(r==fc.APPROVE_OPTION)
			{
				path=fc.getSelectedFile().getAbsolutePath();
				Image im= new ImageIcon(fc.getSelectedFile().getAbsolutePath()).getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT);
				l1.setIcon(new ImageIcon(im));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "User Cancelled Operation");
			}
		}
		else if(ae.getSource()==cb2)
		{
			if(cb2.getSelectedItem().toString().equals("Bachelor"))
			{
				
				JDialog d1= new JDialog(f1, "Enter Your Grades");
				
				JPanel p = new JPanel();
				
				dl1 = new JLabel("Name Of Degree : ");
				dl1.setBounds(10, 30,150, 20);
				dl1.setFont(new Font("Times New Roman",Font.PLAIN,20));
				d1.add(dl1);
				p.add(dl1);
				
				
				 dt1 = new JTextField("");
				 dt1.setBounds(190, 30, 100, 20);
				 p.add(dt1);
				 
				 
				
				  dl2 = new JLabel("Marks Obtained : "); 
				  dl2.setBounds(10, 80, 150, 20);
				  dl2.setFont(new Font("Times New Roman",Font.PLAIN,20));
				  d1.add(dl2);
				  
				  dt2 = new JTextField(marks); 
				  dt2.setBounds(190, 80, 100, 20); 
				  d1.add(dt2);				 
				
				  dl3 = new JLabel("University/College :");
				  dl3.setBounds(10, 130, 180, 20);
				  dl3.setFont(new Font("Times New Roman",Font.PLAIN,20));
				  d1.add(dl3);
				  
				  dt2 = new JTextField(college); 
				  dt2.setBounds(190, 133, 100, 20); 
				  d1.add(dt2);	
				  
				  dl4 = new JLabel("Year of Graduation :");
				  dl4.setBounds(10, 180, 180, 20);
				  dl4.setFont(new Font("Times New Roman",Font.PLAIN,20));
				  d1.add(dl4);
				  
				  dt3 = new JTextField(yeargraduation); 
				  dt3.setBounds(190, 183, 100, 20); 
				  d1.add(dt3);
				  
				  
				  db1= new JButton("OK");
				  db1.setBounds(60,220,60,25);
				  d1.add(db1);
				  
				  db2 = new JButton("Cancel");
				  db2.setBounds(170, 220, 80, 25);
				  d1.add(db2);
				  
				  db1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
			
						  System.out.println(degree=dt1.getText()); 
						  System.out.println(marks=dt2.getText());
						  System.out.println(college=dt3.getText());
						  System.out.println(yeargraduation=dt3.getText());
						  if(degree.isEmpty() || marks.isEmpty() || college.isEmpty() || yeargraduation.isEmpty())
						  {
							  JOptionPane.showMessageDialog(null, "Please fill all the details");
						  }
						  else if(JOptionPane.showConfirmDialog(null, "Do you want to save the Details?")==0)
						  {
								Test.degreeName=degree;
								Test.clgpercent=marks;
								Test.collegeName=college;
								Test.yearGraduation=yeargraduation;
							  d1.dispose();
							  
						  }
					}
				});
				  db2.addActionListener(new ActionListener() {
					  public void actionPerformed(ActionEvent e)
					  {
						  d1.dispose();
					  }
				  });
				  
				 
				 p.setLayout(null);
				d1.add(p);
				d1.setLocation(550, 200);
				d1.setSize(350, 300);
				d1.setVisible(true);
			}
		}
		if(ae.getSource()==b2)
		{
			Test.name=tf1.getText();
			Test.dob = tf2.getText();
			Test.mail=tf3.getText();
			Test.contact = tf4.getText();
			Test.address=tf5.getText();
			Test.gender=(String)cb1.getSelectedItem();
			Test.image=path;
			Test.grade12=tf6.getText();
			Test.school12=tf7.getText();
			Test.year12=tf43.getText();
			Test.grade10 = tf8.getText();
			Test.school10 = tf9.getText();
			Test.year10 = tf44.getText();
			
			Test.title1=tf10.getText();
			Test.platform1=tf11.getText();
			Test.date1=tf12.getText();
		
			Test.pTitle1=tf34.getText();
			Test.technology1=tf35.getText();
			Test.pEndDate1=tf36.getText();
			
			Test.pTitle2=tf37.getText();
			Test.technology2=tf38.getText();
			Test.pEndDate2=tf39.getText();
			
			Test.pTitle3=tf40.getText();
			Test.technology3=tf41.getText();
			Test.pEndDate3=tf42.getText();
			
			Test.skill1=tf25.getText();
			Test.skill2=tf26.getText();
			Test.skill3=tf27.getText();
			Test.skill4=tf28.getText();
			Test.skill5=tf29.getText();
			Test.skill6=tf30.getText();
			Test.skill7=tf31.getText();
			Test.skill8=tf32.getText();
			Test.skill9=tf33.getText();
			
			
			try {
				new Test(path);
				JOptionPane.showMessageDialog(null, "Successfully Created");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		if(me.getSource()==tf10)
		{
			tf10.setText("");
			tf10.setForeground(Color.black);
			
		}
		else if(me.getSource()==tf11)
		{
			tf11.setText("");
			tf11.setForeground(Color.black);
		}
		else if(me.getSource()==tf12)
		{
			tf12.setText("");
			tf12.setForeground(Color.black);
		}
		else if(me.getSource()==tf34)
		{
			tf34.setText("");
			tf34.setForeground(Color.black);
		}
		else if(me.getSource()==tf35)
		{
			tf35.setText("");
			tf35.setForeground(Color.black);
		}
		else if(me.getSource()==tf36)
		{
			tf36.setText("");
			tf36.setForeground(Color.black);
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method stub
		if(me.getSource()==tf10)
		{
			tf10.setForeground(Color.black);
		}
		else if(me.getSource()==tf11)
		{
			tf11.setForeground(Color.black);
		}
		else if(me.getSource()==tf12)
		{
			tf12.setForeground(Color.black);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HomePage().setVisible(true);
	}
	

}
