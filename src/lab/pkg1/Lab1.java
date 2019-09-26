/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;

/* Name: Ryan Scott
 * Class: CSCI c201/INFO I210
 * Term: Fall 2019
 * Assignment: Area Compute
 * Due Date: 09/16/2019
 *
 * @author ryanscott
 */
import java.util.Scanner; // Scanner is in the java.util package
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create Scanner object
       Scanner input = new Scanner(System.in);
       
       // prompt user to enter item ammount
       System.out.print("Please enter the item amount ");
       double Item_Amount = input.nextDouble();
       
       // prompt user to enter price
       System.out.print("Please enter the price of the item ");
       double Item_Price = input.nextDouble();
       
       // calculate Totle Price
       double Total = Item_Amount * Item_Price;
       
       // Display Total
       System.out.println("The total price is $" + Total);
    } // end main method
    
} // end class
