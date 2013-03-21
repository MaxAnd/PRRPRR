package kap15;

import java.util.LinkedList;
import java.util.Scanner;
/*import java.util.Stack;*/

public class StackTest {

    public static void main(String[] args) {
        LinkedList<String> LankadLista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        char svar;
        boolean fortsatt = true;

        while (fortsatt) {
            System.out.println("STACK: ");
            if (LankadLista.isEmpty()) {
                System.out.println("Ingen stack just nu");
            } else {
                for (String namn : LankadLista) {
                    System.out.println(namn + "  ");
                }//end for
            }//end if else


            System.out.println("");
            System.out.println("Välj:");
            System.out.println("1. Lägg en tallrik på tallrikstraven");
            System.out.println("2. Vems tallrik ligger nu högst upp?");
            System.out.println("3. Ta bort översta tallriken");

            System.out.println("0. Avsluta");
            try {
                svar = sc.nextLine().charAt(0);

                switch (svar) {
                    case '1':
                        System.out.println("Vems tallrik? ");
                        String namn = sc.nextLine();
                        LankadLista.push(namn);
                        break;
                    case '2':
                        System.out.println("Högst upp är " + LankadLista.peek() + "'s tallrik");
                        System.out.println("(Tryck ENTER)");
                        sc.nextLine();
                        break;
                    case '3':
                        System.out.println("Tar bort " + LankadLista.pop() + "'s tallrik");
                        System.out.println("(Tryck ENTER)");
                        sc.nextLine();
                        break;
                    case '0':
                        fortsatt = false;
                        System.out.println("SLUT");
                        break;
                    default:
                }

            } catch (Exception e) {
                System.out.println("ERROR");
            }


        }//end while
    }//end main
}//end class
