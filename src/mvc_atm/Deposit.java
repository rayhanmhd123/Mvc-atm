/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_atm;

import mvc_atm.Transaction;
import mvc_atm.DepositSlot;
import mvc_atm.BankDatabase;
import mvc_atm.Screen;
import mvc_atm.Keypad;

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
public class Deposit extends Transaction  
 {  
   private double amount;   // amount to deposit  
   private Keypad keypad;   // references to keypad  
   private DepositSlot depositSlot;  // references to deposit slot  
   private final static int CANCELED = 0; // constant for cancel option  
   // Deposit constructor  
   public Deposit(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad, DepositSlot atmDepositSlot){  
     // initializes superclass variables  
     super(userAccountNumber, atmScreen, atmBankDatabase);  
     // initialize references to keypad and deposit slot  
     keypad = atmKeypad;  
     depositSlot = atmDepositSlot;  
   }  // end Deposit constructor  
   // perform transaction  
   @Override  
   public void execute(){  
     BankDatabase bankDatabase = getBankDatabase();   // get reference  
     Screen screen = getScreen();    // get reference  
     amount = promptForDepositAmount(); // get deposit amount from user  
     // check whether the user entered a deposit amount or canceled  
     if(amount != CANCELED){  
       // request deposit envelope containing specified amount  
       screen.displayMessage("\nPlease insert a deposit envelope containing ");  
       screen.displayDollarAmount(amount);  
       screen.displayMessage(".");  
       // receive deposit envelope  
       boolean envelopeReceived = depositSlot.isEnvelopeReceived();  
       // check whether deposit envelope was received  
       if(envelopeReceived){  
         screen.displayMessageLine("\nYour envelope has been received.");  
         screen.displayMessage("NOTE: The money just deposited will not be available until we verify the amount");  
         screen.displayMessage("of any enclosed cash and your checks clear.");  
         // credit account to reflect the deposit  
         bankDatabase.credit(getAccountNumber(), amount);  
       }  // end if  
       else{  
         // deposit envelope not received  
         screen.displayMessageLine("\nYou did not insert an envelope");  
         screen.displayMessageLine("So, the ATM has canceled your transaction.");  
       }  // end else  
     }  // end if  
     else{  
       // user canceled instead of entering amount  
       screen.displayMessageLine("\nCanceling transaction...");  
     }  // end else  
   }  // end method execute  
   // prompt user to enter a deposit amount in cents  
   private double promptForDepositAmount(){  
     Screen screen = getScreen();  // get references to screen  
     // display the prompt  
     screen.displayMessage("\nPlease enter a deposit amount in CENTS (or 0 to cancel)");  
     int input = keypad.getInput(); // receive input of deposit amount  
     // check whether the user canceled or entered a valid amount  
     if(input == CANCELED) return CANCELED;  
     else{  
       return (double) input / 100;    // return dollar amount  
     }  // end else  
   }  // end method  
   }  // end class Deposit