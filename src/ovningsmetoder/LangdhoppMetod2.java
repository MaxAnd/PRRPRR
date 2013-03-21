

package ovningsmetoder;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class LangdhoppMetod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Support program = new Support();
        
        double v, l;
        
        System.out.println("Ange vindstyrka: ");
        v = sc.nextDouble();
        System.out.println("Ange hoppets längd: ");
        l = sc.nextDouble();
        
        boolean svar = program.hopp(l, v);
        
        if (svar) {
            System.out.println("Grattis, du slog Mike Powells världsrekord!");
            
        }
        else{
            System.out.println("Sorry, försök igen.");
        }
    }//end main

}//end class
