/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ovningsmetoder;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class MinstTal {
    
    public static void main(String[] args) {
        
        MinstSupport program = new MinstSupport();
        
        Scanner sc = new Scanner(System.in);
        
        double tal1, tal2;
        
        System.out.println("Mata in ett tal: ");
        tal1 = sc.nextDouble();
        System.out.println("Mata in ett tall till: ");
        tal2 = sc.nextDouble();
        
        double min = program.minst(tal1, tal2);
        
        System.out.println("Det minsta talet är: " + min);
        
        
    }//end main
}//end class
