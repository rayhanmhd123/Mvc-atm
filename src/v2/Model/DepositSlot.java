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
public class DepositSlot  
 {  
   // indicate whether envelope was received (always returns true)  
   // because this is only a software simulation of a real deposit slot  
   public boolean isEnvelopeReceived(){  
     return true;  // deposit envelope was received  
   }  // end method isEnvelopeReceived  
 }  // end class DepositSlot