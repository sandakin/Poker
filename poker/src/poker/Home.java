package poker;

//import games.texas;

//import java.awt.BorderLayout;
//import java.awt.EventQueue;

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

public class Home extends JFrame {

	
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
	
	
	

	static JLabel c1,c2,c3,c4,c5;
	JLabel lblPlayerName;
	static JLabel p4cash,p1cash,p2cash,p3cash;
	
	static JLabel lblPot;

	static JButton btnCall,btnRaise, next;
	static JButton btnFold;
	static JLabel winner;
	/**
	 * Launch the application.
	 */
//	static texas t;
//	public static void main(String[] args) {
//		
//		//new Home();
//		t= new texas();
//		// onplay o =new onplay();    	
//	   t.setcards(2,4);
//	   
//	  
//	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 544);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 139, 34));
		contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 p3h2 = new JLabel("");
		p3h2.setBounds(298, 5, 122, 96);
		p3h2.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p3h2);
		
		 p3h1 = new JLabel("");
		p3h1.setBounds(399, 5, 122, 96);
		p3h1.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p3h1);
		
		 p4h1 = new JLabel("");
		p4h1.setBounds(10, 111, 121, 96);
		p4h1.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p4h1);
		
		 p2h2 = new JLabel("");
		p2h2.setBounds(733, 111, 121, 96);
		p2h2.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p2h2);
		
		 p4h2 = new JLabel("");
		p4h2.setBounds(10, 212, 121, 96);
		p4h2.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p4h2);
		
		p2h1 = new JLabel("");
		p2h1.setBounds(733, 212, 121, 96);
		p2h1.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_back.png"));
		contentPane.add(p2h1);
		
		p1h1 = new JLabel("");
		p1h1.setBounds(299, 393, 81, 101);
		p1h1.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_00.png"));
		contentPane.add(p1h1);
		
		p1h2 = new JLabel("");
		p1h2.setBounds(400, 393, 81, 101);
		p1h2.setIcon(new ImageIcon("C:\\Users\\Chinthaka\\Desktop\\texasholdem\\src\\images\\card_01.png"));
		contentPane.add(p1h2);
		
		 lblPlayerName = new JLabel("Player Name");
		lblPlayerName.setBounds(10, 62, 72, 14);
		contentPane.add(lblPlayerName);
		
		 label_7 = new JLabel("Player Name");
		label_7.setBounds(723, 62, 72, 14);
		contentPane.add(label_7);
		
		 label_8 = new JLabel("Player Name");
		label_8.setBounds(216, 11, 72, 14);
		contentPane.add(label_8);
		
		 label_9 = new JLabel("Player Name");
		label_9.setBounds(216, 441, 72, 14);
		contentPane.add(label_9);
		
		 p4cash = new JLabel("Cash:500");
		p4cash.setBounds(10, 87, 72, 14);
		contentPane.add(p4cash);
		
		 p3cash = new JLabel("Cash:500");
		p3cash.setBounds(216, 36, 72, 14);
		contentPane.add(p3cash);
		
		 p1cash = new JLabel("Cash:500");
		p1cash.setBounds(216, 416, 72, 14);
		contentPane.add(p1cash);
		
		 p2cash = new JLabel("Cash:500");
		p2cash.setBounds(723, 87, 72, 14);
		contentPane.add(p2cash);
		
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
		 btnCall.setEnabled(false);
		btnCall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				 texas t= new texas();
//				t.setcards(2,3);
				//ph1set("1","5c");
			}
		});
		btnCall.setBounds(493, 460, 89, 23);
		contentPane.add(btnCall);
		
		 btnRaise = new JButton("Raise");
		 btnRaise.setEnabled(false);
		btnRaise.setBounds(591, 460, 89, 23);
		contentPane.add(btnRaise);
		
		 btnFold = new JButton("FOLD");
		 btnFold.setEnabled(false);
//		 btnFold.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
////				t.removeplayer(1);
////				 t.view();
////				player p=new player();
////				p.fold();
//			}
//		});
		btnFold.setBounds(688, 460, 89, 23);
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
		next.setBounds(74, 416, 89, 23);
		contentPane.add(next);
		
		winner = new JLabel("New label");
		winner.setBounds(23, 480, 235, 14);
		contentPane.add(winner);
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
public static void setchips(int chip,int id)
{
	if(id==0){
		p1cash.setText(""+chip);
		
	}else if(id==1){
		p2cash.setText(""+chip);
	}else if(id==2)
	{p3cash.setText(""+chip);
		
	}else if(id==3)
	{p1cash.setText(""+chip);
		
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

public static void setwinner(int win,String a)
{
 winner.setText("Winner is player"+win+"-by-"+a);	
}

}
