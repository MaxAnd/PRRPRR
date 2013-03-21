/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap1;

import java.util.Scanner;

/**
 *
 * @author maxand
 */
public class Alder2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alder;
        System.out.print("Hur gammal är du? ");
        alder = sc.nextInt();
        
        if (alder > 17){
            System.out.println("Du är myndig!");
        }
        else {
            System.out.println("Du är inte myndig!");
        }
        
        
    }//end main
    
}//end class
