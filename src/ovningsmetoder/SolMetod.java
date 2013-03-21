
package ovningsmetoder;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class SolMetod {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SolSupport program = new SolSupport();

        String stad;
        int h;
        char z;

        
        do {
            System.out.println("Ange en stad: ");
            stad = sc.next();
            System.out.println("Ange antal soltimmar: ");
            h = sc.nextInt();
            program.soltimmar(stad, h);
            System.out.println("Vill du forsätta? J/N");
            z = sc.next().charAt(0);
        } while (z == 'J' || z == 'j');
        
        System.out.println("Hejdå!");
        
        
        
    }//end main

}//end class
