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
public class Summera2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x, y, s;
        char fortsatt;
        
        do {
            System.out.print("Skriv ett tal: ");
            x = sc.nextInt();
            System.out.print("Skriv ett tal till: ");
            y = sc.nextInt();
            s = y + x;
            System.out.println("Summan är: " + s);
            System.out.print("Ny Beräkning? ( J/N )");
            fortsatt = sc.next().charAt(0);
        } while (fortsatt == 'j' || fortsatt == 'J');
        
    }//end main

}//end class
