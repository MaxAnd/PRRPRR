

package kap15;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class HashTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> ht = new HashMap<>();
        char svar;
        int antalRatt = 0;
        boolean fortsatt = true;
        while (fortsatt) {
            System.out.println("");
            System.out.println("Välj: ");
            System.out.println("1. Skapa hashtabellen");
            System.out.println("2. Sök huvudstad");
            System.out.println("3. Visa hashtabellens innehåll");
            System.out.println("4. Geografiförhör");
            System.out.println("0. Avsluta");
            try {
                svar = sc.nextLine().charAt(0);
                switch (svar) {
                    case '1':
                        ht.put("Danmark", "Köpenhamn");
                        ht.put("England", "London");
                        ht.put("Finland", "Helsingfors");
                        ht.put("Frankrike", "Paris");
                        ht.put("Indien", "New Dehli");
                        ht.put("Italien", "Rom");
                        ht.put("Kanada", "Ottawa");
                        ht.put("Kina", "Peking");
                        ht.put("Norge", "Oslo");
                        ht.put("Ryssland", "Moskva");
                        ht.put("Spanien", "Madrid");
                        ht.put("Sverige", "Stockholm");
                        ht.put("Tyskland", "Berlin");
                        ht.put("USA", "Washington, D.C.");
                        System.out.println("Klart! ");
                        break;
                    case '2':
                        System.out.println("Vilket lands huvudstad vill du kolla? ");
                        String land = sc.nextLine();
                        System.out.println("Huvudstad: " + ht.get(land));
                        break;
                    case '3':
                        for (String nyckel : ht.keySet()) {
                            System.out.print(nyckel + ": ");
                            System.out.println(ht.get(nyckel));
                        }
                        break;
                    case '4':
                        for (String nyckel : ht.keySet()) {
                            System.out.println("Vad huvudstaden i " + nyckel + "? ");
                            String svaret = sc.nextLine();
                            if (svaret.equals(ht.get(nyckel))) {
                                System.out.println("Rätt! ");
                                antalRatt++;
                            }else{
                                System.out.println("Fel! Rätt svar är " + ht.get(nyckel));
                            }
                        }//end for
                        System.out.println("Du fick " + antalRatt + " av " + ht.size());
                        break;
                    case '0':
                        System.out.println("SLUT");
                        fortsatt = false;
                        break;
                    default:
                }//end switch
            } catch (Exception e) {
            }
        }//end while
        String land = sc.nextLine();
        while (!land.equals("#")) {
            System.out.println("Huvudstad: " + ht.get(land));
            System.out.println("Land? ");
            land = sc.nextLine();
        }//end while
        System.out.println("SLUT");
    }//end main
}//end class
