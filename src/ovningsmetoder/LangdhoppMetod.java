

package ovningsmetoder;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class LangdhoppMetod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Support pr1 = new Support();
        double v, l;
        
        
        System.out.println("Ange vindstyrka: ");
        v = sc.nextDouble();
        System.out.println("Ange hoppets längd: ");
        l = sc.nextDouble();
        
        double svar = pr1.rekord(l, v);
        System.out.println("Skillnaden är " + svar + " meter");
        
    }

}
