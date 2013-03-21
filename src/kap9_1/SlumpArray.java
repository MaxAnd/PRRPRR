

package kap9_1;

/**
 *
 * @author Max Andersson
 */
public class SlumpArray {
    public static void main(String[] args) {
        
        int n = 100;
        int[] a = new int[n];
        
        System.out.println("Arrayens element slumpas och skrivs ut: ");
        
        for (int i = 0; i < a.length; i++) {
            if(i % 10 == 0); {
                System.out.println("");
            }
            a[i] = (int) ( 1000 * Math.random());
            System.out.print(a[i] + "\t");
        }//end for
        System.out.println("");
    }//end main
}//end class
