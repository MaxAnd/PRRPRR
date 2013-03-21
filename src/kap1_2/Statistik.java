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
public class Statistik {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int summa = 0, tal = 0, n, medel = 0, max = 0;
        
            System.out.println("Hur många tal ska behandlas? ");
            n = sc.nextInt();
            
        for (int i = 0; i < n; i++) {
            System.out.print("Ange ett tal: ");
            tal = sc.nextInt();
            
            summa = summa + tal;
            medel = summa / n;
            
            if (tal > max){
                max = tal;
            }
        }
            System.out.println("Summan är " + summa);
            
            System.out.println("Medelvärdet är " + medel);
            
            System.out.println("Största värdet är " + max);
        
        
    }//end main

}//end class
