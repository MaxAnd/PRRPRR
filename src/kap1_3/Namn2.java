

package kap1_3;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class Namn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String namn, namn2;
        
        System.out.println("Skriv in ditt namn: ");
        namn = sc.next();
        System.out.println("Skriv in din kompis namn: ");
        namn2 = sc.next();
        
        if (namn.equals(namn2)) {
            System.out.println("Ni heter samma sak.");
        }else{
            System.out.println("Ni heter inte samma sak.");
        }
    }//end main

}//end class
