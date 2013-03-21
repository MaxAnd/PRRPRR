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
public class Langdhopp {
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        double langd, vind;
        
        //inmatning
        System.out.print("Ange vindhastighet: ");
        vind = sc.nextDouble();
        
        System.out.print("Ange hoppets längd: ");
        langd = sc.nextDouble();
        
        //beräkning
        if(vind <= 2.0 && langd > 7.92){
            System.out.println("Grattis, du har slagit klubbrekordet!");
        }
        else{
            System.out.println("Försök igen!");
        }
        
        
    }//end main

}//end class
