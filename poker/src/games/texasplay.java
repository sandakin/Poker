package games;

import poker.Home;
import poker.cards;
import poker.player;
import poker.table;

public class texasplay {
	player p[];
	public texasplay()
	{ int[][] win =new int[2][2];
		texas t;
		table tab =new table();
		t=tab.texasretn();
		//t.removeplayer(1);
		
		cards c[];
		
	
		cards[] comnc ;
		
		comnc=t.comm.showcards();
		rules rls =new rules(comnc);
		
		p = t.allplayers();
	
		c=p[0].showcards();

		tab.curnthcardh=c[0].hashCode();
	
		for(int pid=0;p.length>pid;pid++)
		{
	
			if (!p[pid].fold)
				{
				
				c=p[pid].showcards();
	
			
				System.out.println(" player is "+pid);
              
               
				rls.highcard(c,tab.curnthcardh);
//				System.out.println(table.curnthcardh);
                 rls.OnePair(c,p[pid]);
                 rls.TwoPair(c,p[pid],0);
                rls.ThreeofaKind(c,p[pid],0);
                rls.Straight(c,p[pid],0);
                rls.Flush(c,p[pid],0);
                rls.FullHouse( p[pid]);
                rls.Fourofkind(c, p[pid], 0);
                rls.StraightFlush(c, p[pid], 0);
                
                
         //now select the which player has the best hand       
                
                if(p[pid].hand=="RF")
                {
                	
                	System.out.println("I won"+p[pid]);
                	
                }else if(p[pid].hand=="OP")
                {
                	
                	System.out.println("I won"+p[pid]);
                	
                }else if(p[pid].hand=="TP")
                {
                	System.out.println("I won"+p[pid]);
                }
                else if(p[pid].hand=="TK")
                {
                	System.out.println("I won"+p[pid]);
                	
                }else if(p[pid].hand=="S")
                {
                	System.out.println("I won"+p[pid]);
                	
                }else if(p[pid].hand=="F")
                {
                	System.out.println("I won"+p[pid]);
                	
                }else if(p[pid].hand=="FH")
                {
                	System.out.println("I won"+p[pid]);
                	
                }else if(p[pid].hand=="FK")
                {
                	
                	System.out.println("I won"+p[pid]);
                }
                else if(p[pid].hand=="SF")
                {
                	System.out.println("I won"+p[pid]);
                	
                }else if(p[pid].hand=="RF")
                {
                	System.out.println("I won"+p[pid]);
                	
                }else if(p[pid].hand=="N")
                {
                	System.out.println("I won"+p[pid]);
                	
                }else
                {
                	
                	System.out.println("no one won it is imposible KKKKKKKKKcccccccccuuuuuuuufffffffff");
                }
                
                
                
                
        
             
                
				}
//			else
//				
//				break;
		}
		System.out.println(table.curnthcardh);
		System.out.println("current high card"+c[0].rethashCode(table.curnthcardh) );
		win[0][0]=0;
		win[0][1]=tab.retnhighcardpid();
		if((rls.pairflag)||rls.pairflag1)
		{ 
			win[0][0]=1;
		win[0][1]=rls.pairvalueplayer;
	System.out.println("highest pair: Player"+(rls.pairvalueplayer+1)+" has cards-"+c[0].rethashCode(rls.pairc3)+c[0].rethashCode(rls.pairc4));
		}
			if(rls.commpairflag)
			{	win[0][0]=2;
			win[0][1]=rls.commpairvalueplayer;
				
	System.out.println("two pair H,H and C,C-"+rls.commpairvalue+"player"+(rls.commpairvalueplayer+1));
					
			}
	if(rls.commpairflag2)
	{win[0][0]=2;
	win[0][1]=rls.commpairvalueplayer;
	System.out.println("two pair H,C and H,C-"+rls.commpairvalue+"player"+(rls.commpairvalueplayer+1));						
	
	
	System.out.println("cards:-"+"cards"+c[0].rethashCode(rls.commpair1)+c[0].rethashCode(rls.commpair2)+c[0].rethashCode(rls.commpair3)+c[0].rethashCode(rls.commpair4));
	}
	if(rls.commpairflag3)
	{win[0][0]=2;
	win[0][1]=rls.commpairvalueplayer;
	System.out.println("two pair H,C and C,C-"+rls.commpairvalue+"player"+(rls.commpairvalueplayer+1));						
	
	
	System.out.println("cards:-"+"cards"+c[0].rethashCode(rls.commpair1)+c[0].rethashCode(rls.commpair2)+c[0].rethashCode(rls.commpair3)+c[0].rethashCode(rls.commpair4));
	}
	
	if(rls.threekind1)
	{win[0][0]=3;
	win[0][1]=rls.threekindplayer;
	System.out.println("Three of kind H-H, C"+(rls.threekindplayer+1));						
	
	
System.out.println("cards:-"+c[0].rethashCode(rls.threekindcard));
	}
	if(rls.threekind2)
	{win[0][0]=3;
	win[0][1]=rls.threekindplayer;
	System.out.println("Three of kind H , C-C"+(rls.threekindplayer+1));						
	
	
System.out.println("cards:-"+c[0].rethashCode(rls.threekindcard));
	}
	
	if(rls.hasstraight)
	{win[0][0]=4;
	win[0][1]=rls.straightplayer;
		System.out.println("has straight-"+rls.straightplayer);
	}
	
	if(rls.hasflush)
	{win[0][0]=5;
	win[0][1]=rls.flushplayer;
		System.out.println("has flush-"+rls.flushplayer);
	}

	
	if(rls.fourofkind1)
	{win[0][0]=6;
	win[0][1]=rls.fourkindplayer;
		System.out.println("has fourofkind-"+rls.fourkindplayer);
	}
	if(rls.fourofkind1)
	{win[0][0]=6;
	win[0][1]=rls.fourkindplayer;
		System.out.println("has flush-"+rls.fourkindplayer);
	}
	
	if(rls.hasflush1)
	{win[0][0]=7;
	win[0][1]=rls.flushplayer1;
		System.out.println("has Straight Flush-"+rls.flushplayer1);
	}
			//	System.out.println(" card is "+tab.curnthcardh);+"player"+rls.pairvalueplayer
	//	System.out.println(" player id  is "+tab.hplayerid);
		
		
	System.out.println("Winner is"+win[0][0]+""+win[0][1]);
	String winner=null;
	if(win[0][0]==0)
	{
		winner="highcard";
	}else if(win[0][0]==1)
	{
		winner="one pair";
	}else if(win[0][0]==2)
	{
		winner="two pair";
	}else if(win[0][0]==3)
	{
		winner="three of kind";
	}else if(win[0][0]==4)
	{
		winner="straight";
	}else if(win[0][0]==5)
	{
		winner="flush";
	}else if(win[0][0]==6)
	{
		winner="four of kind";
	}else if(win[0][0]==7)
	{
		winner="straight flush";
	}
	Home.setwinner(win[0][1]+1,winner);
	}
	
	
	
	 public  void foldplayer( int id )
	 {
		 
		 p[id].fold();
		 p[id].clcard();
	 }
	 public void play(int pl)
	 {
		 if(table.maxBet> p[pl].getbet())
		 {
			 int amount=table.maxBet-p[pl].getbet();
			 callplayer( pl,amount) ;
			 table.pot=table.pot+amount;
			 p[pl].check=true;
		 }
		 else if(table.maxBet==p[pl].getbet())
		 {
			 checkplayer(pl);
		 }
		
		Home.setchips(p[pl].allchips,p[pl].getid()); 
	 }
	 
	 public  void callplayer( int id,int cash )
	 {
		 p[id].call(cash);
		
	 }
	 public  void checkplayer( int id )
	 {
		 p[id].check=true;
		
	 }
	 public  void Raiseplayer( int id )
	 {
		 
		
	 }
	 public  void betplayer( int id )
	 {
		 
		
	 }
	
	
	
	
	}
	
	
	
	
	
	
	
	


