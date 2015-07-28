package poker;

//import games.texas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.ImageIcon;



//import java.awt.GridBagLayout;
//import java.awt.GridBagConstraints;
//import java.awt.Insets;
import java.awt.Color;

import javax.swing.JButton;





import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Omaha extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	static	JLabel p3h2,p3h1,p4h1,p2h2,p4h2,p2h1;
	static JLabel p1h1;
	static JLabel p1h2;
	static JLabel blind1,blind2,blind3,blind4;
	
	static JLabel bet1,bet2,bet3,bet4;
	JLabel label_7;
	JLabel label_8;
	JLabel label_9;
	JLabel label_10;
	JLabel label_11;
	JLabel label_12;

	static JLabel c1,c2,c3,c4,c5;
	JLabel lblPlayerName;
	JLabel lblCash;
	
	static JLabel lblPot;

	static JButton btnCall,btnRaise, next;
	static JButton btnFold;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_13;
	
	/**
	 * Launch the application.
	 */
//	static texas t;
	public static void main(String[] args) {
//		
		new Omaha();
//		t= new texas();
//		// onplay o =new onplay();    	
//	   t.setcards(2,4);
//	   
//	  
	}

	/**
	 * Create the frame.
	 */
	public Omaha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 544);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 139, 34));
		contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 p3h2 = new JLabel("");
		p3h2.setBounds(295, 5, 122, 96);
		p3h2.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p3h2);
		
		 p3h1 = new JLabel("");
		p3h1.setBounds(375, 5, 122, 96);
		p3h1.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p3h1);
		
		 p4h1 = new JLabel("");
		p4h1.setBounds(10, 55, 121, 96);
		p4h1.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p4h1);
		
		 p2h2 = new JLabel("");
		p2h2.setBounds(733, 55, 121, 96);
		p2h2.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p2h2);
		
		 p4h2 = new JLabel("");
		p4h2.setBounds(10, 156, 121, 96);
		p4h2.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p4h2);
		
		p2h1 = new JLabel("");
		p2h1.setBounds(733, 156, 121, 96);
		p2h1.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p2h1);
		
		p1h1 = new JLabel("");
		p1h1.setBounds(319, 393, 81, 101);
		p1h1.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_00.png"));
		contentPane.add(p1h1);
		
		p1h2 = new JLabel("");
		p1h2.setBounds(400, 393, 81, 101);
		p1h2.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_01.png"));
		contentPane.add(p1h2);
		
		 lblPlayerName = new JLabel("Player Name");
		lblPlayerName.setBounds(10, 5, 72, 14);
		contentPane.add(lblPlayerName);
		
		 label_7 = new JLabel("Player Name");
		label_7.setBounds(733, 11, 72, 14);
		contentPane.add(label_7);
		
		 label_8 = new JLabel("Player Name");
		label_8.setBounds(216, 11, 72, 14);
		contentPane.add(label_8);
		
		 label_9 = new JLabel("Player Name");
		label_9.setBounds(167, 368, 72, 14);
		contentPane.add(label_9);
		
		 lblCash = new JLabel("Cash:500");
		lblCash.setBounds(10, 30, 72, 14);
		contentPane.add(lblCash);
		
		 label_10 = new JLabel("Cash:500");
		label_10.setBounds(216, 36, 72, 14);
		contentPane.add(label_10);
		
		 label_11 = new JLabel("Cash:500");
		label_11.setBounds(167, 343, 72, 14);
		contentPane.add(label_11);
		
		 label_12 = new JLabel("Cash:500");
		label_12.setBounds(733, 36, 72, 14);
		contentPane.add(label_12);
		
		 c3 = new JLabel("");
		c3.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_02.png"));
		c3.setBounds(375, 207, 122, 101);
		contentPane.add(c3);
		
		 c2 = new JLabel("");
		c2.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_01.png"));
		c2.setBounds(295, 207, 122, 101);
		contentPane.add(c2);
		
		 c1 = new JLabel("");
		c1.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_00.png"));
		c1.setBounds(216, 207, 122, 101);
		contentPane.add(c1);
		
		 c4 = new JLabel("");
		c4.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_03.png"));
		c4.setBounds(457, 207, 122, 101);
		contentPane.add(c4);
		
		 c5 = new JLabel("");
		c5.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_04.png"));
		c5.setBounds(537, 207, 122, 101);
		contentPane.add(c5);
		
		 lblPot = new JLabel("Pot:40");
		lblPot.setBounds(298, 181, 72, 14);
		contentPane.add(lblPot);
		
		 btnCall = new JButton("Call");
		btnCall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				 texas t= new texas();
//				t.setcards(2,3);
				//ph1set("1","5c");
			}
		});
		btnCall.setBounds(634, 437, 89, 23);
		contentPane.add(btnCall);
		
		 btnRaise = new JButton("Raise");
		btnRaise.setBounds(634, 471, 89, 23);
		contentPane.add(btnRaise);
		
		 btnFold = new JButton("FOLD");
//		 btnFold.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
////				t.removeplayer(1);
////				 t.view();
////				player p=new player();
////				p.fold();
//			}
//		});
		btnFold.setBounds(733, 471, 89, 23);
		contentPane.add(btnFold);
		
		 blind1 = new JLabel("");
		blind1.setBounds(298, 368, 46, 14);
		contentPane.add(blind1);
		
		 blind2 = new JLabel("");
		blind2.setBounds(669, 294, 46, 14);
		contentPane.add(blind2);
		
		 blind3 = new JLabel("");
		blind3.setBounds(298, 122, 46, 14);
		contentPane.add(blind3);
		
		blind4 = new JLabel("");
		blind4.setBounds(108, 294, 46, 14);
		contentPane.add(blind4);
		
		 bet1 = new JLabel("P1:");
		bet1.setBounds(413, 354, 46, 14);
		contentPane.add(bet1);
		
		 bet2 = new JLabel("P2:");
		bet2.setBounds(634, 182, 46, 14);
		contentPane.add(bet2);
		
		 bet3 = new JLabel("P3:");
		bet3.setBounds(413, 134, 46, 14);
		contentPane.add(bet3);
		
		 bet4 = new JLabel("P3:");
		bet4.setBounds(108, 147, 46, 14);
		contentPane.add(bet4);
		
		 next = new JButton("Go");
		next.setBounds(283, 339, 89, 23);
		contentPane.add(next);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Omaha.class.getResource("/images/5c.png")));
		label.setBounds(457, 5, 122, 96);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Omaha.class.getResource("/images/5c.png")));
		label_1.setBounds(548, 5, 122, 96);
		contentPane.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Omaha.class.getResource("/images/8s.png")));
		label_2.setBounds(733, 263, 121, 96);
		contentPane.add(label_2);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Omaha.class.getResource("/images/3c.png")));
		label_3.setBounds(10, 263, 121, 96);
		contentPane.add(label_3);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Omaha.class.getResource("/images/9s.png")));
		label_4.setBounds(478, 393, 121, 96);
		contentPane.add(label_4);
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Omaha.class.getResource("/images/5d.png")));
		label_5.setBounds(244, 393, 81, 96);
		contentPane.add(label_5);
		
		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Omaha.class.getResource("/images/3h.png")));
		label_6.setBounds(10, 375, 72, 96);
		contentPane.add(label_6);
		
		label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(Omaha.class.getResource("/images/7h.png")));
		label_13.setBounds(733, 364, 121, 96);
		contentPane.add(label_13);
		setVisible(true);
	}
	public static  void btn1( )

	{	
		
		contentPane.repaint();
//		 btnFold.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent arg0) {
////					t.removeplayer(a);
////					 t.view();
////					player p=new player();
////					p.fold();
//				}
//			});
	}
public static void ph1set(int a ,String c,int x)

{
	if ( a==1 )
	{	
		if(x==0){
			p1h1.setIcon(ResourceManager.getCardImage(c));
		}else if(x==1){
			p1h2.setIcon(ResourceManager.getCardImage(c));
		}
	
	
	
	}
	else if (a ==2)
	{
		if(x==0){
			p2h1.setIcon(ResourceManager.getCardImage(c));
		}else if(x==1){
			p2h2.setIcon(ResourceManager.getCardImage(c));
		}
	}
	else if(a ==3)
	{
		if(x==0){
			p3h1.setIcon(ResourceManager.getCardImage(c));
		}else if(x==1){
			p3h2.setIcon(ResourceManager.getCardImage(c));
		}
	}
	else if(a ==4)
	{
		if(x==0){
			p4h1.setIcon(ResourceManager.getCardImage(c));
		}else if(x==1){
			p4h2.setIcon(ResourceManager.getCardImage(c));
		}
	}
	
}

public static void comset(String c,int a)
{
	if ( a==0 )
	{
	c1.setIcon(ResourceManager.getCardImage(c));
	}
	else if(a ==1)
	{
		c2.setIcon(ResourceManager.getCardImage(c));
	}
	else if(a ==2)
	{
		c3.setIcon(ResourceManager.getCardImage(c));
	}
	else if(a ==3)
	{
		c4.setIcon(ResourceManager.getCardImage(c));
	}
	else if(a ==4)
	{
		c5.setIcon(ResourceManager.getCardImage(c));
	}
}	

public static void blindset(int d,int sb,int bb,player[] pl){
	
	blind1.setText("");
	blind2.setText("");
	blind3.setText("");
	blind4.setText("");
	
	if(d==1){
		
		blind1.setText("Dealer");
		blind2.setText("Small Blind");
		blind3.setText("Big Blind");
	}
				
else if(d==2)
{		
		blind2.setText("Dealer");
		blind3.setText("Small Blind");
		blind4.setText("Big Blind");
		
}else if(d==3)
{
		blind3.setText("Dealer");
		blind4.setText("Small Blind");
		blind1.setText("Big Blind");
	
}else if(d==4)
{
		blind4.setText("Dealer");
		blind1.setText("Small Blind");
		blind2.setText("Big Blind");
}

	
}

public static void setpot()
{
	
lblPot.setText(""+table.pot);
	
}

public static void setbet(int a,int bet)
{
	
if(a==0)
{
	bet1.setText(""+bet);
}
else if(a==1)
{
	bet2.setText(""+bet);
}else if(a==2)
{
	bet3.setText(""+bet);
}
else if(a==3)
{
	bet4.setText(""+bet);
}
	
}
}
