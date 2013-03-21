

package kap15;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class LankadListaTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<String> namnLista = new LinkedList<>();
        int val = 1;
        boolean fortsatt = true;
        String namn;
        
        while (fortsatt)
        {
        
            if(namnLista.isEmpty()){
                System.out.println("Listan är tom.");
            }else{
                for (int i = 0; i < namnLista.size(); i++) {
                    System.out.println(i + "." + namnLista.get(i));
                }//end forloop
            }//end if else
        System.out.println("DINA VAL");
        System.out.println("");
        System.out.println("1. Fyll listan med namn ");
        System.out.println("2. Lägg till ett namn ");
        System.out.println("3. Lägg till ett namn på en viss plats ");
        System.out.println("4. Se element nummer ");
        System.out.println("5. Ta bort element nummer ");
        System.out.println("6. Ta bort ett namn ");
        System.out.println("7. Ta bort alla ");
        System.out.println("0. Avsluta");
        
        System.out.println("Välj: ");
        
            try {
                
            
        val = sc.nextInt();
        
        switch (val) {
            case 1:
                namnLista.add("Leia");
                namnLista.add("Han");
                namnLista.add("Jabba");
                namnLista.add("Chewbacca");
                namnLista.add("Obi-Wan");
                namnLista.add("Anakin");
                break;
            case 2:
                System.out.println("Ange namnet: ");
                namn = sc.next();
                if (!namn.equals("")) {
                    namnLista.add(namn);
                }
                break;
            case 3:
                System.out.println("Ange platsen: ");
                int plats = sc.nextInt();
                System.out.println("Ange namnet: ");
                namn = sc.next();
                namnLista.add(plats, namn);
                
                break;
            case 4:
                System.out.println("Ange vilken du vill granska: ");
                plats = sc.nextInt();
                System.out.println("Platsen har namnet: " + namnLista.get(plats));
                break;
            case 5:
                System.out.println("Ange platsen du vill ta bort: ");
                plats = sc.nextInt();
                namnLista.remove(plats);
                break;
            case 6:
                System.out.println("Ange namnet du vill ta bort: ");
                namn = sc.next();
                boolean hittad = false;
                if (!namn.equals("")) {
                    for (String namnetIListan : namnLista) {
                        if (namnetIListan.equals(namn)) {
                            namnLista.remove(namn);
                            hittad = true;
                        }//end if
                    }//end for
                }//end if
                break;
            case 7:
                System.out.println("Ta bort listan(j/n)");
                char svar = sc.next().charAt(0);
                if (svar == 'j' || svar == 'J') {
                namnLista.clear();    
                }else{
                    System.out.println("Du ångrade dig");
                }
                break;
            case 0:
                fortsatt = false;
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Felaktig inmatning");
        }//end switch
        } catch (Exception e) {
                System.out.println("Tyvärr uppstod ett fel. Vår otroligt skillade programmerare arbetar (antagligen inte) på problemet just nu!");
            }
        }//end while
    }//end main
}//end class
