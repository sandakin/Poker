package games;

import java.util.Arrays;



//!!Apache commons lang library required !!
import org.apache.commons.lang3.ArrayUtils;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
import poker.cards;
import poker.player;
import poker.table;

public class rules {
	
	public static int PLAYER_CARDS=2;
	public static int COMM_CARDS=5;
		int x;
		boolean dd=false;
	//pair variables	
	public int  pairvalue=0;
	int pairc1,pairc2,pairc3,pairc4;
	int pairvalueplayer,pairvalueplayer1;
	public boolean pairflag=false,pairflag1=false;
	
	int hhcard;
	
	//Two Pair variables
	public boolean commpairflag=false;
	public int  commpairvalue=0;
	int commpairvalueplayer;
	boolean commpairflag2=false,commpairflag3=false;
	int commcount=0;
	int commpair1,commpair2,commpair3,commpair4;
	int cgb;
	static int[] arr1= new int[10];
	static	int[] arr2= new int[10];
	static	int[] arr3= new int[10];
	static int v1=0,v2=0;	
	int max,max2;
	int commplayer=-1;
	
	//3 of kind variables
	boolean threekind1=false; 
	boolean threekind2=false; 
	int threekindplayer;
	int threekindcard;
	int threekindvalue;
	public cards[] cr=new cards[52];
	
	
	//int newpairvalue,newpairvalue2;
	
	//Straight variables
	int[] tarr=new int[7];
int	straightcard=0;
int straightplayer;
boolean hasstraight=false;
int [][] combined;
int[][] newar=new int[7][2]; 
//FLUSH variables
int Dcount=0,Ccount=0,Hcount=0,Scount=0;
int flushvalue=0;
int flushplayer;
boolean hasflush=false;

//Royal flush and Straight flush
int flushvalue1=0;
int flushplayer1;
boolean hasflush1=false;


//Four of KInd
boolean fourofkind1=false; 
boolean fourkind2=false; 
int fourkindplayer;
int fourkindcard;
int fourkindvalue;

public rules(cards[] crr)
{
	
		cr=crr;
		
}	
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//HIGH CARD
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	void highcard(cards[] c,int hchighcard)
	{ 
		/*A hand that consists of five cards that do not make any of the hands listed above. 
                 An Ace, King, Queen, Jack and 9 is the highest ranked High Card hand and 7, 5, 4, 3 and 2 
                 the lowest ranked High Card hand*/
		
		for(int j=0;c.length>j;j++)
     {	
			if(c[j]==null)
			{
				break;
			}
					
		if(c[j].hashCode()<hchighcard)
	{
		
		}
		else{
			
			table.curnthcardh=c[j].hashCode();
		}
	}}
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//ONE PAIR
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	void OnePair(cards[] c,player p)
	{
//		int t=0;
		settotalcards(c);
		  
            /*A hand that consists of two cards of the same rank. 
         Two Aces is the highest ranked Pair and two 2’s is the lowest ranked Pair*/
		//H-H
		for(int b=0;PLAYER_CARDS>b;b++){
		
			
			if(!(c[b+1]==null))
			{
				if(c[b].getRank()==c[b+1].getRank())
				{
					pairflag=true;
					dd=true;
					System.out.println(p.getplayersname()+"has pair");
					int newpairvalue=c[b].hashCode()+c[b+1].hashCode();
					
						if(pairvalue<newpairvalue)
						{
							pairvalue=newpairvalue;
							pairc3=c[b].hashCode();
							pairc4=c[b+1].hashCode();
							hhcard=c[b].getRank();//h-h rank for 3 of kind
							pairvalueplayer=p.getid();
							p.hand="OP";
						}
					
				} 
			}
		}
		
		      
            //C-H
//	System.out.println("cr length"+cr.length);
//	System.out.println("c length"+c.length);   
		for(int j=0;c.length>j;j++)
				{	
	     if(!(c[j]==null)){
		
		for(int i=0;cr.length>i;i++)
		{
			if(!(cr[i]==null)){
				
				if(c[j].getRank()==cr[i].getRank())
				{ pairflag1=true;
				
				
//				for(int p1=0;arr.length>p1;p1++){
//					arr[p1]=c[j].hashCode();
//					arr[p1+1]=c[i].hashCode();
//				}
					
					
					int newpairvalue=c[j].hashCode()+cr[i].hashCode();
					
						if(pairvalue<newpairvalue)
						{
							System.out.println("count"+(cgb++));
							pairvalue=newpairvalue;
							pairc3=c[j].hashCode();
							pairc4=cr[i].hashCode();
							pairvalueplayer=p.getid();
							pairvalueplayer1=p.getid();//for 2 pair H-C and C-C
							p.hand="OP";
						}
					
				} 
			
			}
		    
		}	
	}
		
  
                }
  	
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//TWO PAIR
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//H-H and C-C
	
	void TwoPair(cards[] c,player p,int cm)
	{	
		commcount=cm;
		
		if(dd)
		{
			for(int b=0;COMM_CARDS-1>b;b++)
			{
							//System.out.println("b size"+b);
				
				for(int e=b+1;COMM_CARDS>e;e++)
				{ 
							//	System.out.println("e size"+e);
					
					if(cr[b].getRank()==cr[e].getRank()){
						commpairflag=true;
						int newpairvalue=cr[b].hashCode()+cr[e].hashCode()+pairvalue;
						if(commpairvalue<newpairvalue)
						{
							commpairvalue=newpairvalue;
//							pairc1=c[b].hashCode();
//							pairc2=cr[b+1].hashCode();
							commpairvalueplayer=p.getid();
							p.hand="TP";
						}
					}
					
				}
				
			}
		}
		
	//H-C and H-C
			for(int j=0;c.length>j;j++)
			{	//commpairvalue=0;
				if(!(c[j]==null)){

				for(int i=0;cr.length>i;i++)
				{
					if(!(cr[i]==null)){
			
							if(c[j].getRank()==cr[i].getRank())
							{
								commcount++;    
								
									//int newpairvalue=c[j].hashCode()+cr[i].hashCode();						
									
								
									arr1[v1]=
									arr2[v1]=
									arr3[v1]=p.getid();
									v1++;
								
									if(commcount==1)
									{
										commpair1=c[j].hashCode();
										commpair2=cr[i].hashCode();
									}if(commcount==2)
									{
										commpairflag2=true;
										commpair3=c[j].hashCode();
										commpair4=cr[i].hashCode();
									int	newpairvalue=commpair1+commpair2+commpair3+commpair4;
										if(commpairvalue<newpairvalue)
										{
											commpairvalue=newpairvalue;
											commpairvalueplayer=p.getid();
											p.hand="TP";
										}
									}
									
//									
								
							}
						}
					}
				}
				}
			
		//H-C and C-C
if(pairflag1)
{   
	
	for(int b=0;COMM_CARDS-1>b;b++)
	{
					//System.out.println("b size"+b);
		
		for(int e=b+1;COMM_CARDS>e;e++)
		{ 
					//	System.out.println("e size"+e);
			
			if(cr[b].getRank()==cr[e].getRank()){
				
				commpairflag3=true;
				
				int newpairvalue=cr[b].hashCode()+cr[e].hashCode()+pairvalue;
				
				if(commpairvalue<newpairvalue)
				{
					commpairvalue=newpairvalue;
//					pairc1=c[b].hashCode();
//					pairc2=cr[b+1].hashCode();
					commpairvalueplayer=pairvalueplayer1;
					p.hand="TP";
				}
			}
			
		}
		
	}
	}
		


	}
	
	
	
	
	void ThreeofaKind(cards[] c,player p,int cm)
	{
//		settotalcards(c);
		/*A hand that consists of three cards of the same rank. 
                 Three Aces is the highest ranked Three of a Kind and
                 three 2’s is the lowest ranked Three of a Kind.*/
	
		//H-H and C for 3 of kind
		if(dd)
		{
			for(int b=0;COMM_CARDS>b;b++)
			{
				if(!(cr[b]==null))
				{
				if(cr[b].getRank()==hhcard)
				{
					threekind1=true;
					int newthreevale=cr[b].getRank();
					if(threekindvalue<newthreevale)
					{
						threekindvalue=newthreevale;
						threekindplayer=p.getid();
						threekindcard=cr[b].hashCode();
						p.hand="Tk";
						
					}
				
				}
				}
			}
		}
		
		//C-C and H check for 3 of kind 
		for(int b=0;COMM_CARDS-1>b;b++)
		{
						//System.out.println("b size"+b);
			
			for(int e=b+1;COMM_CARDS>e;e++)
			{ 
						//	System.out.println("e size"+e);
				
				if(cr[b].getRank()==cr[e].getRank()){
					
					for(int b1=0;PLAYER_CARDS>b1;b1++)
					{if(!(c[b1]==null))
						{
							if(c[b1].getRank()==cr[b].getRank())
							{
								threekind2=true;
								int newthreevale=cr[b].getRank();
								if(threekindvalue<newthreevale)
								{
									threekindvalue=newthreevale;
									threekindplayer=p.getid();
									threekindcard=cr[b].hashCode();
									p.hand="Tk";
								}
							}
						}
						
						}
					
										
//					int newpairvalue=cr[b].hashCode()+cr[e].hashCode()+pairvalue;
//					
//					if(commpairvalue<newpairvalue)
//					{
//						commpairvalue=newpairvalue;
////						pairc1=c[b].hashCode();
////						pairc2=cr[b+1].hashCode();
//						commpairvalueplayer=pairvalueplayer1;
//					}
				}
				
			}
			
		}
		
		
	}
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
	//STARIGHT
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	void Straight(cards[] c,player p,int cm)
	{
		int sconu=cm;
		
		int sc=0;
//		settotalcards(c);
		int[][] ar1=new int[5][2];
		int[][] ar2=new int[2][2];
		
		for(int b=0;5>b;b++)
		{if(!(cr[b]==null))
			{
			ar1[b][0]=cr[b].getRank();
			ar1[b][1]=cr[b].hashCode();
			}
		}
		
		for(int b=0;2>b;b++)
		{if(!(c[b]==null)){
			ar2[b][0]=c[b].getRank();
			ar2[b][1]=c[b].hashCode();
		}}
				
		
		combined=ArrayUtils.addAll(ar1,ar2);
		//Arrays.sort(combined);
		java.util.Arrays.sort(combined, new java.util.Comparator<int[]>() {
			   public int compare(int[] a, int[] b) {
		        return Double.compare(a[0], b[0]);
		    }
		});
		
//		for(int i2=0;7>i2;i2++)
//		{
//			System.out.println("straght array"+combined[i2][0]);
//			System.out.println("straght array"+combined[i2][1]);
//		}
		
		for(int b=6;b>0;b--)
		{
			
			if(combined[b][0]==(combined[b-1][0]+1))
			{
				newar[sc][0]=combined[b][0];
				newar[sc][1]=combined[b][1];
						sc++;
						
				newar[sc][0]=combined[b-1][0];
				newar[sc][1]=combined[b-1][1];
				
				sconu++;
				
				if(sconu==4)
				{
					break;
				}
//						System.out.println("sta equal");
			}else{
				if(sc==4)
				{hasstraight=true;
							int newstvalue=newar[0][0];
						if(straightcard<newstvalue)
						{
							straightcard=newstvalue;
							straightplayer=p.getid();
							p.hand="S";
						}
//							System.out.println("Player has flush"+p.getid());
				}else
				{
					sc=0;
//					System.out.println("sta not equal");
				}
			
					}

		}	
	
				
//				for(int i=0;newar.length>i;i++)
//					{   
//						System.out.println("final array1-"+newar[i][0]);
//						System.out.println("final array2-"+newar[i][1]);
//					}
				
				if(sc==4)
				{
					hasstraight=true;
					int newstvalue=newar[0][0];
					if(straightcard<newstvalue)
					{
						straightcard=newstvalue;
						straightplayer=p.getid();
						p.hand="S";
					}
					
					//System.out.println("Player has flush-"+p.getid());
				}
	
	}
	
	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//FLUSH
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	void Flush(cards[] c,player p,int cm)
	{Dcount=cm;
	Ccount=cm;
	Hcount=cm;
	Scount=cm;
	int Dhcount=0,Chcount=0,Hhcount=0,Shcount=0;
	
//		cards[] cd;
//	   cd=p.showcards();
	
		
	for(int i=0;i<7;i++)
	{	
		int a=combined[i][1]%4;
		
		if(a==0)
		{	 Dcount++;
		   Dhcount=Dhcount+combined[i][1];
		}
		else if(a==1){
			 Ccount++;
			 Chcount=Chcount+combined[i][1];
		}
		else if(a==2){
			 Hcount++;
			 Hhcount=Hhcount+combined[i][1];
		}
		else if(a==3){
			 Scount++;
			 Shcount=Shcount+combined[i][1];
		}
	
	}
		
		if(Dcount==5)
		{
			if(flushvalue<Dhcount)
			{
				flushvalue=Dhcount;
				flushplayer=p.getid();
				hasflush=true;
				p.hand="F";
			}
		}
		else if(Ccount==5)
		{
			if(flushvalue<Chcount)
			{
				flushvalue=Chcount;
				flushplayer=p.getid();
				hasflush=true;
				p.hand="F";
			}
		}
		else if(Hcount==5)
		{
			if(flushvalue<Hhcount)
			{
				flushvalue=Hhcount;
				flushplayer=p.getid();
				hasflush=true;
				p.hand="F";
			}
		}
		else if(Scount==5)
		{
			if(flushvalue<Shcount)
			{
				flushvalue=Shcount;
				flushplayer=p.getid();
				hasflush=true;
				p.hand="F";
			}
		}
	}
	
	void Fourofkind(cards[] c,player p,int cm)
	{ 			
		settotalcards(c);
		
	if(threekind1)
	{
		for(int b=0;COMM_CARDS>b;b++)
		{
			if(!(cr[b]==null))
			{
			if(cr[b].getRank()==threekindcard)
			{
				fourofkind1=true;
				int newfourvalue=cr[b].getRank();
				if(fourkindvalue<newfourvalue)
				{
					fourkindvalue=newfourvalue;
					fourkindplayer=p.getid();
					threekindcard=cr[b].hashCode();
					p.hand="FK";
				}
			
			}
			}
		}
	}
		
		if(threekind2)
		{
			for(int b=0;COMM_CARDS-1>b;b++)
			{
							//System.out.println("b size"+b);
				
				for(int e=b+1;COMM_CARDS>e;e++)
				{ 
							//	System.out.println("e size"+e);
					
					if(cr[b].getRank()==cr[e].getRank()){
						
						for(int b1=0;PLAYER_CARDS>b1;b1++)
						{if(!(c[b1]==null))
							{
								if(c[b1].getRank()==cr[b].getRank())
								{
									fourkind2=true;
									int newfourvalue=cr[b].getRank();
									if(fourkindvalue<newfourvalue)
									{
										fourkindvalue=newfourvalue;
										fourkindplayer=p.getid();
										fourkindcard=cr[b].hashCode();
										p.hand="FK";
									}
								}
							}
							
							}
						
											
//						int newpairvalue=cr[b].hashCode()+cr[e].hashCode()+pairvalue;
//						
//						if(commpairvalue<newpairvalue)
//						{
//							commpairvalue=newpairvalue;
////							pairc1=c[b].hashCode();
////							pairc2=cr[b+1].hashCode();
//							commpairvalueplayer=pairvalueplayer1;
//						}
					}
					
				}
				
			}
		}
		
	}

	
	//STRAIGHT FLUSH & ROYAL FLUSH
	void StraightFlush(cards[] c,player p,int cm)
	{
		Dcount=cm;
		Ccount=cm;
		Hcount=cm;
		Scount=cm;
		int Dhcount=0,Chcount=0,Hhcount=0,Shcount=0;
		if(hasflush&&hasstraight)
		{
			
			
			
//				cards[] cd;
//			   cd=p.showcards();
			
				
			for(int i=0;i<7;i++)
			{	
				int a=newar[i][1]%4;
				
				if(a==0)
				{	 Dcount++;
				   Dhcount=Dhcount+newar[i][1];
				}
				else if(a==1){
					 Ccount++;
					 Chcount=Chcount+newar[i][1];
				}
				else if(a==2){
					 Hcount++;
					 Hhcount=Hhcount+newar[i][1];
				}
				else if(a==3){
					 Scount++;
					 Shcount=Shcount+newar[i][1];
				}
			
			}
				
				if(Dcount==5)
				{
					if(flushvalue1<Dhcount)
					{
						flushvalue1=Dhcount;
						flushplayer1=p.getid();
						hasflush1=true;
						p.hand="SF";
					}
				}
				else if(Ccount==5)
				{
					if(flushvalue1<Chcount)
					{
						flushvalue1=Chcount;
						flushplayer1=p.getid();
						hasflush1=true;
						p.hand="SF";
					}
				}
				else if(Hcount==5)
				{
					if(flushvalue1<Hhcount)
					{
						flushvalue1=Hhcount;
						flushplayer1=p.getid();
						hasflush1=true;
						p.hand="SF";
					}
				}
				else if(Scount==5)
				{
					if(flushvalue1<Shcount)
					{
						flushvalue1=Shcount;
						flushplayer1=p.getid();
						hasflush1=true;
						p.hand="SF";
					}
				}
			
		}
		
		
	}
	
	
	private void settotalcards(cards[] c)
	{
	
//		System.out.println("crr card"+cr[3].toString());
//		System.out.println("crr card"+cr[4].toString());
		
//		System.out.println("crlength"+cr.length);
//		System.out.println("clength"+c.length);
		for(int k=0;2>k;k++)
			{
			
//		System.out.println(" card"+c[k].toString());
			}
	
		
	}
	
	
	void FullHouse(player p)
	{
		
		
		if((threekind1||threekind2)&(pairflag1||pairflag1))
		{
			
		
			p.hand="FH";
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
