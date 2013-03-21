

package ovningsmetoder;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class TempOmvandling {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        TempSupport omv = new TempSupport();
        
        double x;
        System.out.print("Mata in fahrenheit här: ");
        x = sc.nextDouble();
    

        double svar = omv.cel(x);
        
        System.out.println("Det är " + svar + " grader Celsius");
        
    }

}
