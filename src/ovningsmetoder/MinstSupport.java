/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ovningsmetoder;

/**
 *
 * @author Max Andersson
 */
public class MinstSupport {
    
    public double minst(double tal1, double tal2){
        double min = tal1;
        if(tal2 < tal1){
            min = tal2;
        }
        return min;
    }

}
