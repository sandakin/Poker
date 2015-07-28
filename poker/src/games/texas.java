

package games;



import javax.swing.JFrame;
import javax.swing.JLabel;

import poker.Home;

import poker.cards;
import poker.getCard;
import poker.player;
import poker.table;


/**
 *
 * @author chinthaka
 */
public  class texas extends JFrame {
	
   
	/**
	 * Feds
	 */
	private static final long serialVersionUID = 1L;
	
	 int  nofp=table.nofpm;
	 int x;
//	public int yy;
    cards[] c= new cards[52];
	player[] pq; 
	getCard op= new getCard();
	comcrds comm =new comcrds();
	JLabel p1h1;
		
	public int BB,SB,D,pot; 
		Home h = new Home();
		
		
		
	   
	  public void setcards(int xs,int id)
	  {
		//  xs is number of cards
         //id is no of  player
	  nofp=id;
	 
		 x=xs;
		 pq=new player[nofp];
		 System.out.println(pq.length+""+nofp);
		 
		 /*assign cards to players*/
		int i=0,a=0;	
		
	for(int j=0; j<pq.length; j++)	
	{
		System.out.println(nofp+""+j+""+id);
		pq[j] =new player();
		pq[j].setplayersname("player"+(j+1));
		pq[j].setid(j);
		pq[j].setpos(j+1);
		c=   pq[j].showcards(); 
		System.out.println("--");
		
		  for( i=a;i<x;i++)
		  {
			  if (c[i] == null) 
			    { 
				  
			  	pq[j].setcard(op.sendcard());
			  	
			  	 }  
			   System.out.println(c[i].toString()+" "+pq[j].getplayersname());
			  //  Home.ph1set( j,c[i].toString(),i);+" "+pq[j].getpos()
			    
				}
		  
		  
	  	 		
	 }
	
	//set comm cards
	  for( i=0;i<5;i++)
	  {
		 comm.setcard(op.sendcard());
		  
	}
	 

	
	
	 
	 
	 //view comm cards
	 	 c=comm.showcards();
	 	 
	 	 
	 	 
	  for( i=0;i<5;i++)
	  {
		 
		  System.out.println(c[i].toString());
		  Home.comset(c[i].toString(), i);
	}
//	 for(k=0;k<51;k++){
//		  System.out.println(c[k].toString());
//		  
//		  //System.out.println(c[k].getSuit()+" "+c[k].getRank()+" "+c[k].hashCode());
//	  } 
//	 
//	 for(int cc=0; cc<5; cc++)	
//		{
//		 System.out.println(tt[cc].showcards());
//		}
	 
		
	 
	 
	}
	  
	  public comcrds getcomcards()
	  {
		  
		  
		  return comm;
		  
	  }
	    
	  /*print cards + players on console */	  
	 public void view  ()
	 
	 {
		 for(int j=0; j<pq.length; j++)	
			{
			  System.out.println(pq[j].getplayersname());
			  
			     c= pq[j].showcards();
			    
			  for( int k=0;k<x;k++)
			  {
				  if(c==null)
				     {
					  Home.ph1set( pq[j].getpos(),"back",k);
				    	 
				     }
			else{
				  System.out.println(c[k].toString());
			//	  System.out.println(c.length);
				  System.out.println(c[k].getSuit()+" "+c[k].getRank()+" "+c[k].hashCode()+" "+pq[j].getpos());
				  Home.ph1set( pq[j].getpos(),c[k].toString(),k);
			  }}
			} 
	
	 Home.setpot();
	 }
	  
	 

//			  pq[nofp].setcard(op.sendcard());
			
				 // break;
		//  }
		  //	System.out.println(c[0].toString());
	//	  System.out.println(c[2].hashCode());
	//	  System.out.println(c[3].hashCode());
		// System.out.println(c[4].hashCode());
		// System.out.println(c[5].hashCode());
	//	 System.out.println(c[6].hashCode());
	// System.out.println(c[1].toString());
	//	 System.out.println(c[1].toString());
		 
//		  for(int i=0;i<52;i++)
//			{
//			  p[i].setcard(op.sendcard(),1);
//				 System.out.println(i+"/n  " +p[i].showcards());
//			// System.out.println("he");
//		  
//		 
//			}
//		    }
		  	 
	//  }
	
	
	
	 public texas( )
	  {
	//	nofp=4;
		//for(int i=0;i<nofp;i++)
		//{
			op.shuffle();
		//p[i].setcard(op.sendcard(),1);
			// System.out.println(i+"/n  " +p[i].showcards());
		// System.out.println("he");
		//}	
			 
		}
	 
	 public texas(int nofp)
	  {  
		for(int i=0;i<nofp;i++)
		{
			op.shuffle();
		//	 p[i].setcard(op.sendcard(),2);
			// System.out.println(i+"/n  " +p[i].showcards());
			// System.out.println("he");
			}	
			
		}
	 public  void foldplayer( int id )
	 {
		 
		 pq[id].fold();
		 pq[id].clcard();
	 }
	 
	 
	 public  void callplayer( int id )
	 {
		 
		
	 }
	 public  void checkplayer( int id )
	 {
		 
		
	 }
	 public  void Raiseplayer( int id )
	 {
		 
		
	 }
	 public  void betplayer( int id )
	 {
		 
		
	 }
	 public  void removeplayer( int id )
	 {
	    for ( int i = id ; i < pq.length - 1 ; i++ )
	    {
	      pq[ i ] = pq[ i + 1 ] ; 
	    }
	    
	    nofp--;
	
	 }
		 
	 
	
	 public player[] allplayers()
	 {
		 
		 
		 return  pq;
	 }	
	
	 public comcrds getcomcardsset()
		
		{
			return comm;
		}
    
}
