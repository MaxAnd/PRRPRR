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
public class Betyg {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int poang;
        
        System.out.print("Ange dina poäng: ");
        poang = sc.nextInt();
        
        if ( poang <= 49) {
            System.out.println("F");
        }
        else if ( poang <= 59){
            System.out.println("E");
        }
        else if ( poang <= 69) {
            System.out.println("D");
        }
        else if ( poang <= 79) {
            System.out.println("C");
        }
        else if ( poang <= 94) {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }//end if else
        
    }//end main

}//end class
