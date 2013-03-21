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
public class Summera {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x, y, sum;
        
        System.out.print("Skriv ett tal: ");
        x = sc.nextInt ();
        System.out.print("Skriv ett tal till: ");
        y = sc.nextInt ();
        
        
        sum = x + y;
        
        System.out.println("Summan är: " + sum);
        
        
    }
    
}
