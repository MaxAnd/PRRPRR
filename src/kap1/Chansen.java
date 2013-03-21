/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap1;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class Chansen {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        
        System.out.print("Välj alternativ (A/B): ");
        c = sc.next().charAt(0);
        System.out.println("Du skrev tecknet " + c );
        
        if (c == 'A' || c == 'a'){
            System.out.println("Grattis! Du vann lyxkryssning" );
        }
        else {
            System.out.println("Nitlott!");
        }
    }//end main
    
}//end class
