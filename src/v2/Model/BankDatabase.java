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
public class BankDatabase  
 {  
   private Account[] accounts;   // array of Accounts  
   // no-argument BankDatabase constructor initializes accounts  
   public BankDatabase(){  
     accounts = new Account[3];   // just 2 accounts for testing  
     accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);  
     accounts[1] = new Account(98765, 56789, 200.0, 200.0);
     accounts[2] = new Account(1234, 1234, 500.0, 500.0);  
   }  // end no-argument BankDatabase constructor  
   // retrieve Account object containing specified account number  
   private Account getAccount(int accountNumber){  
     // loop through accounts searching for matching account number  
     for(Account currentAccount : accounts){  
       // return current account if match found  
       if(currentAccount.getAccountNumber() == accountNumber) return currentAccount;  
     }  // end for  
     return null;  // if no matching account was found, return null  
   }  // end method  
   // determine whether user-specified account number and PIN match  
   // those of an account in the database  
   public boolean authenticateUser(int userAccountNumber, int userPIN){  
     // attempt to retrieve the account with the account number  
     Account userAccount = getAccount(userAccountNumber);  
     if(userAccount != null){  
       return userAccount.validatePIN(userPIN);  
     }  
     else{  
       return false;  // account number not found, so return false  
     }  
   }  // end method  
   // return available balance of Account with specified account number  
   public double getAvailableBalance(int userAccountNumber){  
     return getAccount(userAccountNumber).getAvailableBalance();  
   }  // end method  
   public double getTotalBalance(int userAccountNumber){  
     return getAccount(userAccountNumber).getTotalBalance();  
   }  // end method  
   public void credit(int userAccountNumber, double amount){  
     getAccount(userAccountNumber).credit(amount);  
   }  // end method  
   public void debit(int userAccountNumber, double amount){  
     getAccount(userAccountNumber).debit(amount);  
   }  // end method  
   }  // end class BankDatabase