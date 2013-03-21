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
public class Loopen2 {
    
    public static void main(String[] args) {
        //Deklarationer:
        Scanner sc = new Scanner(System.in);
        String fnamn;
        int n;
        //Inmatningar:
        System.out.print("Skriv ditt namn: ");
        fnamn = sc.next();
        System.out.print("Hur många varv? ");
        n = sc.nextInt();
        //Här körs loopen:
        int i = 0;          // här nollställs räknaren i
        while ( i < n ){
            System.out.println("Du heter " + fnamn);
            i++;
        }
        
        System.out.println("--- Nu är loopen slut, " + fnamn + "! ---");
    }//end main
}//end class
