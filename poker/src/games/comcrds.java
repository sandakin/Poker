package games;

import poker.cards;



public class comcrds {
int i=0;
	cards[] cp= new cards[7];
	
	
	
	 public void setcard(cards c)
	    { 
	    	// n is no of cards 
	   
	    	cp[i++]=c;
	    	//i=i+1;
	    }
	 
	 public cards[] showcards( )
	    {
	  
	 	return cp;
	        
	    }
	
}
