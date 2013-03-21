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
public class Aritmetik {    
    public static void main(String[] args) {
        
        //Deklaration
       Scanner sc = new Scanner(System.in);
       double x, y, sum, diff, produkt, kvot;
       
       //Inmatning
        System.out.print("Skriv ett tal: ");
        x = sc.nextDouble();
        System.out.print("Skriv in ett tal till: ");
        y = sc.nextDouble();
        
        //Beräkning
        sum = x + y;
        diff = x - y;
        kvot = x / y;
        produkt = x * y;
        
        //Utskrift
        System.out.println("Summan är " + sum);
        System.out.println("Differensen är " + diff);
        System.out.println("Kvoten är " + kvot);
        System.out.println("Produkten är " + produkt);
        
    }//end main
    
}//end class
