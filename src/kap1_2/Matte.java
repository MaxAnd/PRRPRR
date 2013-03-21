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
public class Matte {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        double tal1, tal2, sum, diff, produkt, kvot;
        char r, fort;
        
            
        
        //inmatning
        do {
        
        System.out.print("Skriv ett tal: ");
        tal1 = sc.nextDouble();
        System.out.print("Skriv ett tal till: ");
        tal2 = sc.nextDouble();
        System.out.print("Vilket räknesätt vill du använda? ");
        r = sc.next().charAt(0);
        
        
        if (r == '+'){
            sum = tal1 + tal2;
            System.out.println("Summan är: " + sum);
        }
        else if (r == '-'){
            diff = tal1 - tal2;
            System.out.println("Differensen är " + diff);
        }
        else if (r == '*'){
            produkt = tal1 * tal2;
            System.out.println("Produkten är " + produkt);
        }
        else {
            kvot = tal1 / tal2;
            System.out.println("Kvoten är " + kvot);
        }
            System.out.println("Vill du fortsätta? (J)");
            fort = sc.next().charAt(0);
            
        }   while ( fort == 'J' || fort == 'j');
        
        
    }//end main

}//end class
