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
public class Feber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feber;
        System.out.print("Ange din kroppstemp! ");
        feber = sc.nextDouble();
        
        if (feber > 37.5){
            System.out.println("Du har feber! ");
            
        }
        
        else if (feber < 22.5){
            System.out.println("Du är troligen död inom kort! ");
        }
        
        else {
            System.out.println("Du är frisk! ");
        }
        
    }//end main
    
}//end class
