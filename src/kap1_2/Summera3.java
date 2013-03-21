

package kap1_2;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class Summera3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, s;
        char f;
        do {
        System.out.println("Ange x: ");
        x = sc.nextInt();
        System.out.println("Ange y: ");
        y = sc.nextInt();
        s = x + y;
        System.out.println("Summan är " + s);
            System.out.println("Vill du fortsätta? J/N");
            f = sc.next().charAt(0);
        }while (f == 'J' || f == 'j');
        
    }

}
