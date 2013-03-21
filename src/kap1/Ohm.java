

package kap1;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class Ohm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double u, r, i;
        
        System.out.print("Ange strömmen (i): ");
        i = sc.nextDouble();
        System.out.print("Ange resistansen (r): ");
        r = sc.nextDouble();
        
        u = r*i;
        System.out.println("Spänningen är " + u + "V");
        
        
    }//end main 

}//end class
