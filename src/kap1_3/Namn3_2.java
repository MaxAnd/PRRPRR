

package kap1_3;



/**
 *
 * @author Max Andersson
 */
public class Namn3_2 {
    public static void main(String[] args) {

        String namn = "Max Andersson";
        System.out.print(namn.charAt(0) + ".");
        
        for (int i = 0; i < namn.length(); i++) {
            if(namn.charAt(i) == ' '){
                System.out.println(namn.charAt(i + 1));
            }
        }//end for
    }//end main

}//end class
