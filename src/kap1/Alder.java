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
public class Alder {
    public static void main(String[] args) {
        //Deklaration
        int alder;
        Scanner sc = new Scanner(System.in);
        
        //Inmatning
        System.out.print("Ange din ålder: ");
        alder = sc.nextInt();
        
        //Beräkning
        //alder = alder + 1;
        alder++;
        
        System.out.println("Nästa gång fyller du " + alder + " år");
        
    }//end main
    
}//end class
