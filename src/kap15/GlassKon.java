

package kap15;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class GlassKon {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<String> glassKo = new LinkedList<>();
        boolean fortsatt = true;
        char svar;
        
        while (fortsatt)
        {
            System.out.println("FÖRST I KÖN: ");
            if(glassKo.isEmpty()) { 
                System.out.println("Ingen kö just nu");
            }
            else{
                for (String namn : glassKo) {
                    System.out.println(namn + "  ");
                }
            }//end if else
        System.out.println("");
        System.out.println("Välj: ");
        System.out.println("1. Lägg till nu person");
        System.out.println("2. Vem är först i kön?");
        System.out.println("3. Ta bort person");
        System.out.println("0. Avsluta");
        
            try {
                
            
         svar = sc.nextLine().charAt(0);
        
        switch (svar) {
            case '1':
                System.out.println("Skriv ett namn: ");
                String namn = sc.nextLine();
                glassKo.addLast(namn);
                break;
            case '2':
                System.out.println("Först i kön: " + glassKo.getFirst());
                System.out.println("(TRYCK ENTER)"); sc.nextLine();
                break;
            case '3':
                glassKo.removeFirst();
                break;
            case '0':
                fortsatt = false;
                System.out.println("SLUT");
                break;
            default: 
                break;
        }//end switch
        } catch (Exception e) {
                System.out.println("Tyvärr uppstod ett fel. Vår otroligt skillade programmerare arbetar (antagligen inte) på problemet just nu!");
            }
        }//end while
    }//end main
}//end class
