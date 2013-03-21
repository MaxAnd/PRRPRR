

package kap1_3;

/**
 *
 * @author Max Andersson
 */
public class Namn {
    public static void main(String[] args) {
        String namn = "Max Andersson";
        
        for (int i = 0; i < namn.length(); i++) {
            System.out.print(namn.charAt(i));
        }
        System.out.println("");
        
        for (int i = namn.length()-1; i >= 0; i--) {
            System.out.print(namn.charAt(i));
        }
        System.out.println("");
        
    }//end main
    
}//end class
