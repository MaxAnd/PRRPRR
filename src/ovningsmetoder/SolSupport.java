

package ovningsmetoder;

/**
 *
 * @author Max Andersson
 */
public class SolSupport {
    
    public void soltimmar(String stad, int sol){
        System.out.print(stad + ": ");
        for (int i = 0; i < sol; i++) {
            System.out.print("*");
            
            
        }
        System.out.println("");
    }

}
