
package ovningsmetoder;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class CirkelMetod {
    public static void main(String[] args) {
        //Deklaration
        Scanner sc = new Scanner(System.in);
        CirkelSupport rakna1 = new CirkelSupport();
        CirkelSupport rakna2 = new CirkelSupport();
        DecimalFormat d = new DecimalFormat("0.##");
        
        double r;
        //Inmatning
        System.out.println("Ange radien: ");
        r = sc.nextDouble();
        
        double om = rakna1.omkrets(r);
        double a = rakna2.area(r);
        //Utskrift
        System.out.println("Omkretsen är " + d.format(om));
        System.out.println("Arean är " + d.format(a));
    }

}
