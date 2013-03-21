

package kap1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class Cirkeln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.##");
        
        double a, r, o;
        boolean stor;
        
        System.out.println("Ange radien: ");
        r = sc.nextDouble();
        
        
        o = 2*r*Math.PI;
        a = r*r*Math.PI;
        stor = a > 20;
        
        if (stor) {
            System.out.println("Arean är: " + d.format(a));
            System.out.println("Omkretsen är: " + d.format(o));
            System.out.println("Det är en stor jävla cirkel det!");
        }
        else{
            System.out.println("Arean är: " + d.format(a));
            System.out.println("Omkretsen är: " + d.format(o));
            System.out.println("Det var en liten cirkel det..");
        }
    }//end main

}//end class
