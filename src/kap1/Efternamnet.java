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
public class Efternamnet {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enamn;
        System.out.print("Skriv ditt namn: ");
        enamn = sc.nextLine();
        System.out.println("Du heter " + enamn + ", och det är ett jävligt fint namn det!");
        
    }//end main
    
}//end class
