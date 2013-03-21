

package kap1_3;

/**
 *
 * @author Max Andersson
 */
public class StringTest {
    public static void main(String[] args) {
        String namn = "Max";
        String namn2 = "Göran";
        
        boolean test = namn.equals(namn2);
        System.out.println("" + test);
        
        if (namn.equals(namn2)) {
            System.out.println("lika");
        }
        else{
            System.out.println("ej lika");
        }
        
    }//end main

}//end class
