/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poker;
import java.security.SecureRandom;
import java.util.Random;

import poker.cards;

/**
 *
 * @author MYPC
 */
public class getCard {
    
    int noofplayers;
    int nCIndex=0;
     cards[] c;
     public getCard()
    {
   
    // ArrayList<Integer> al =new ArrayList<Integer>();
	  
       int i =0;
       
        c =new cards[52];
         for (int s= 0; s <=3 ; s++) {
             for (int r =0; r <=12 ; r++) {
            	 c[i++] = new cards(r,s);
            	// System.out.println(i);
            	   
//            	  System.out.println(c[i++].toString() +" "+ c[i++].getRank());
//               System.out.println (c.hashCode());
           }
             }
         
         
//         Test > print all cards
//         for(int ii=0; ii<=51; ii++)
//         {
//        	 System.out.println (c[ii].getRank()+" "+c[ii].hashCode()+" "+c[ii].toString());   
//         }
         
        
         
      //   al.add(c.hashCode());
    	  }        
           private Random r=new SecureRandom();
           
           
     public void shuffle() {
         for (int oIndex = 0; oIndex < 52; oIndex++) {
             int nIndex = r.nextInt(52);
            cards tempCard = c[oIndex];
             c[oIndex] = c[nIndex];
             c[nIndex] = tempCard;
         }
         nCIndex = 0;
     }
    
     
  public cards sendcard()
 
  {
	  
    	 return  c[nCIndex++];
    	 
     }
     
}
