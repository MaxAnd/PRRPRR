

package kap15;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class GlosLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> ht = new HashMap<>();
        char svar;
        boolean fortsatt = true;
        int rattsvar = 0;
        
        while (fortsatt) {
            System.out.println("DINA VAL");
            System.out.println("");
            System.out.println("1. Skapa gloslista");
            System.out.println("2. Visa gloslista");
            System.out.println("3. Lägg till glosa");
            System.out.println("4. Glosförhör");
            System.out.println("0. Avsluta");
            
            try {
                svar = sc.next().charAt(0);
                switch (svar) {
                    case '1':
                        ht.put("Ost", "Cheese");
                        ht.put("Lada", "Barn");
                        ht.put("Lodis", "Bum");
                        ht.put("Tysk", "German");
                        ht.put("Rasist", "Racist");
                        ht.put("Mamma", "Mother");
                        ht.put("Tupp", "Rooster");
                        ht.put("Ister", "Lard");
                        ht.put("Dator", "Computer");
                        
                        System.out.println("Klart!");
                        break;
                    case '2':
                        for (String nyckel : ht.keySet()) {
                            System.out.print(nyckel + ": ");
                            System.out.println(ht.get(nyckel));
                        }
                        break;
                    case '3':
                        System.out.println("Ange det svenska ordet: ");
                        String sv = sc.next();
                        System.out.println("Ange det engelska ordet: ");
                        String en = sc.next();
                        ht.put(sv, en);
                        break;
                    case '4':
                        for (String nyckel : ht.keySet()) {
                            System.out.println("Vad heter " + nyckel + " på engelska?");
                            String svaret = sc.next();
                            if (svaret.equals(ht.get(nyckel))) {
                                System.out.println("Rätt!");
                                rattsvar++;
                            }else{
                                System.out.println("Fel!");
                            }//end if/else
                        }//end for
                        System.out.println("Antal rätt: " + rattsvar + "/" + ht.size());
                        break;
                    case '0':
                        System.out.println("Nu är det sluuuut! Tooooot!");
                        fortsatt = false;
                        break;
                    default:
                }
            } catch (Exception e) {
                
            }
        }//end while
    }//end main
}//end class
