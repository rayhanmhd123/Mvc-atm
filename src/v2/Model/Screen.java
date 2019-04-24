/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v2.Model;

import mvc_atm.*;

/**
 *
 * @author  *
 *
 * RayhanMuhammad
 * @rayhanmhd123@yahoo.co.id
 * @rayhanmhd123@gmail.com
 * @muhammad.rayhan.tif17@polban.ac.id
 *
 *
 */
public class Screen  
 {  
   // display a message without a carriage return  
   public void displayMessage(String message){  
     System.out.print(message);  
   }  // end method displayMessage  
   // display a message with a carriage return  
   public void displayMessageLine(String message){  
     System.out.println(message);  
   }  // end method displayMessageLine  
   // displays a dollar amount  
   public void displayDollarAmount(double amount){  
     System.out.printf("$%,.2f", amount);  
   }  // end method displayDollarAmount  
 }  // end class Screen