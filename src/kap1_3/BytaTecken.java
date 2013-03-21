

package kap1_3;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class BytaTecken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder hemligtOrd = new StringBuilder("????");
        
        System.out.println(hemligtOrd.toString());
        
        for (int i = 0; i < hemligtOrd.length(); i++) {
            System.out.print("Ange en bokstav: ");
            char tecken = sc.next().charAt(0);
            hemligtOrd.setCharAt(i, tecken);
            System.out.println(hemligtOrd.toString());
        }
        
            System.out.println("Du klarade det! Yay!");
        
    }//end main
}//end class
