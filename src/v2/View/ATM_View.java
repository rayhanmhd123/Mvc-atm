/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v2.View;

import v2.Model.ATM;

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
public class ATM_View {
    
    private ATM atm;
    
    
    public void welcome(){
        while(true){
            while(!userAuthenticated){
                screen.displayMessageLine("\nWelcome!");
                authenticateUser();    
            }  
           
            performTransactions();      
            userAuthenticated = false;  
            currentAccountNumber = 0;  
            screen.displayMessageLine("\nThank You!\nGoodbye!");
        }
    }
    
}
