

package kap1_3;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class Namn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String fnamn, enamn;
        
        System.out.println("Vad heter du i förnamn? ");
        fnamn = sc.next();
        System.out.println("Vad heter du i efternamn? ");
        enamn = sc.next();
        
        System.out.println(fnamn.charAt(0) + "." + enamn.charAt(0));
    }
}
