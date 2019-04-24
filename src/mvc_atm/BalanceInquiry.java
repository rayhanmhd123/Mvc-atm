/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_atm;

import mvc_atm.Transaction;
import mvc_atm.BankDatabase;
import mvc_atm.Screen;

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
public class BalanceInquiry extends Transaction  
 {  
   // BalanceInquiry constructor  
   public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase){  
     super(userAccountNumber, atmScreen, atmBankDatabase);  
   }  // end BalanceInquiry constructor  
   // performs the transaction  
   @Override  
   public void execute(){  
     // get references to bank database and screen  
     BankDatabase bankDatabase = getBankDatabase();  
     Screen screen = getScreen();  
     // get the available balance for the account involved  
     double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());  
     // get the total balance for the account involved  
     double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());  
     // display the balance information on the screen  
     screen.displayMessageLine("\nBalance Information : ");  
     screen.displayMessage(" - Available Balance : ");  
     screen.displayDollarAmount(availableBalance);  
     screen.displayMessage("\n - Total Balance : ");  
     screen.displayDollarAmount(totalBalance);  
     screen.displayMessageLine("");  
   }  // end method execute  
   }  // end class BalanceInquiry