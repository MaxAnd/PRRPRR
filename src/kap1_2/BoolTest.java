/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap1_2;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class BoolTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int alder;
        boolean myndig;
        
        System.out.print("Skriv din ålder: ");
        
        alder = sc.nextInt();
        myndig = alder > 17;
        
        if ( myndig ) {
            System.out.println("Du är myndig!");
        }
        else {
            System.out.println("Du är inte myndig!");
        }
        
    }//end main

}//end class
