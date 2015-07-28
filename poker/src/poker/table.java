package poker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import games.texas;
import games.texasplay;

public class table extends JFrame  {

	private static final long serialVersionUID = 1L;
	
	int noofplayers;
	
public static int curnthcardh;//has code of player id

public int hplayerid;
public static int pot=0;
static int iD=0,iB=2,iS=1,iPl=0;


static int[] p ;//= new int[9];
public static texas t;
static player[] pl;
public static int nofpm;
public static int BB,SB,D,Pl,maxBet=10;

public void setthighcardpid(int pid)
{
	
	hplayerid=pid;
 
}
public int retnhighcardpid()
{
	
	return hplayerid;
}
public void setcurenthighcard(int c)
{
	
 curnthcardh=c;
 
}
public int retncurenthighcard()
{
	
return curnthcardh;

}
texasplay tx;
  void maindss() {
	
	//new Home();(String[] args)
	t= new texas();
	// onplay o =new onplay();
	nofpm=4;
	SB=5;
	BB=SB*2;
	p =new int[nofpm];
   t.setcards(2,nofpm);
   t.view  ();
   add();
Home.setpot();
    tx=new texasplay();
  
   
   Home.btnFold.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
//			t.removeplayer(2);
			
		tx.foldplayer(0);			
			t.view();
			//System.out.println(p.length+""+nofpm);
			
		}
	});
   Home.btnCall.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
//			t.foldplayer(3);
//			t.view();
			//System.out.println(p.length+""+nofpm);
			//rotate2();
			call();
		}
	});
   
   
   Home.btnRaise.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
raise();
		}
	});
   
   Home.next.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
play();
		}
	});
}


public texas texasretn()
{
return t;
}



public static  void  rotate1( )
{
	pl=t.allplayers();
	
	if(iD==nofpm){
		iD=0;
		D=p[iD];
	}else{
		D=p[iD];	
	}
	
	
	if((iS)==nofpm){
		iS=0;
		SB=p[iS];
	}else{
		SB=p[iS];
	}
	
	if((iB)==nofpm){
		iB=0;
		BB=p[iB];
	}else{
		BB=p[iB];
	}
	
	iD++;
	iB++;
	iS++;
	
	
Home.blindset(pl[D].getpos(),pl[SB].getpos(),pl[BB].getpos(), pl);
//	System.out.println("current Player-"+pl[Pl]. getplayersname());
	
//System.out.println("Dealer-"+pl[D].getpos()+" Small Bind-"+pl[SB].getpos()+" Big bind-"+pl[BB].getpos());
//}

}


public static void rotate2()
{
	pl=t.allplayers();
	if(iPl==nofpm){
		iPl=0;
		Pl=p[iPl];
	}else{
		Pl=p[iPl];
	}
	
	iPl++;
//	if(maxBet==pl[Pl].bet)
//	{
//		Home.btnCall.setText("Check");
//		Home.btnRaise.setText("Bet");
//	}if(maxBet>pl[Pl].bet)
//	{
//		Home.btnCall.setText("Call");
//		Home.btnRaise.setText("Raise");
		
//	}
}

public static void call2()
{
	pl=t.allplayers();
	
	if(maxBet==0)
	{
		maxBet= BB;	
		pot = pot+maxBet;
		pl[Pl].call(maxBet);
		Home.setpot();
		Home.setbet( Pl,pl[Pl].getbet());
	}
	else if(maxBet>pl[Pl].bet)
	{
		int a= maxBet-pl[Pl].bet;
		pot = pot+a;
		pl[Pl].call(a);
		Home.setpot();
		Home.setbet( Pl,pl[Pl].getbet());
		
	}else if(maxBet==pl[Pl].bet)
	{
		System.out.println("next player");
		
	}
	
	
	
//	rotate1();
	System.out.println(""+Pl);
}

public static void raise()
{


	int amount=(table.maxBet-pl[0].getbet())*2;
	pl[0].call(amount);
	pl[0].check=true;
	pot=pot+amount;
	
}

static void add()
{
	for(int ei=0;ei<nofpm;ei++)
	{
		p[ei]=ei;
	}	
}



public void play()
{
	pl=t.allplayers();
	
	
	if(Pl==0)
		
	{   System.out.println("PL0------"+Pl);
		Home.btnCall.setEnabled(true);
		Home.btnFold.setEnabled(true);
		Home.btnRaise.setEnabled(true);
		Home.next.setEnabled(false);
		Home.setpot();
	}
	else if(Pl==1)
			{
		Home.next.setEnabled(true);
		System.out.println("PL1------"+Pl);
		tx.play(Pl);
		Home.setpot();
	}
	 else if(Pl==2)
	{
		 Home.next.setEnabled(true);
		 System.out.println("PL2------"+Pl);
		 tx.play(Pl);
		 Home.setpot();
	}
	else if(Pl==3)
	{
		Home.next.setEnabled(true);
		System.out.println("PL3------"+Pl);
		tx.play(Pl);
		Home.setpot();
	}
	
	if(pl[1].check)
	{
	System.out.println("DONE"+Pl);
	}
	rotate2();
	// rotate1();
     }

public void call()
{
	System.out.println("PLcall---"+Pl+pl[0].bet);
	if(maxBet>pl[0].bet)
	{
		int amount=table.maxBet-pl[0].getbet();
		pl[0].call(amount);
		pl[0].check=true;
		pot=pot+amount;
	}	
	Home.setpot();
	Home.setchips(pl[0].allchips,pl[0].getid()); 
	
rotate2();
 play();
 Home.btnCall.setEnabled(false);
	Home.btnFold.setEnabled(false);
	Home.btnRaise.setEnabled(false);
}






}








