/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poker;

//import games.texas;

/**
 *
 * @author MYPC
 */
public class player {
    
    public int allchips=500;
   String name;
   int id,pos,p=0;
   int bet;
    int luck,i=0;
   public boolean fold;
   public boolean check;
   
    cards[] cp= new cards[7];
    
cards[] pair =new cards[4];
 public String hand="N" ;

    public int setluck(int lk)
    {
    	
    	luck=lk;
    	
   	return luck;
    	
    }
   
    public void setcard(cards c)
    { 
    	// n is no of cards 
   
    	cp[i++]=c;
    	//i=i+1;
    }
    
    public void setpaircard(cards c)
    { 
    	// n is no of cards 
   
    	pair[p++]=c;
    	//i=i+1;
    }
    public void clcard()
    { 
    	// n is no of cards 
   
    	cp=null;
    	//i=i+1;
    }
    public cards[] showcards( )
    {
  
 	return cp;
        
    }
    public cards[] showpaircards( )
    {
  
 	return pair;
        
    }
   
   public int rase(int x )
   {
      allchips = allchips-x; // we set minimum rase value as double of call value
      
       
 
       return x;
       
   }
      public int call(int b)
       {
    	  allchips = allchips-b;
          bet=b;
       return 0;
       
   }
                    
           public int getbet()
    {
       
       
       return bet;
       
   }
         public void check()
         {
        	 check=true;
         }
       public int   raise()
   {
       
       
  
       return 0;
       
   }
   public  void fold()
    {
       fold=true;
       
       
   }
   public void setid(int ids)
	  {
		 
		id=ids;
		 
	  }
   public int getid()
	  {
		
		 return id;
	  }
   public void setplayersname(String na)
	  {
		 
		name=na;
		 
	  }
   
   public String getplayersname()
	  {
		 
		return name;
		 
	  }
   public void setchips(int chp)
	  {
		 
		allchips=chp;
		 
	  }
	 
   public void setpos(int x)
	
   {
		 
		pos=x;
		 
	  }
   
   public int getpos()
   
	  {
		 
		return pos;
		 
	  }
   
   public int gethash()
   {
	   
	   
	   return 0;
}
      
}
