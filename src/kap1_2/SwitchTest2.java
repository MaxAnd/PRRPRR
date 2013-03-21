

package kap1_2;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("Ange månad: ");
        month = sc.nextInt();
        
        switch (month) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Feb");
                break;
            default:
                System.out.println("sadlkgjaksgb");
        }
    }

}
