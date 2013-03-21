/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ovningsmetoder;

/**
 *
 * @author Max Andersson
 */
public class Support {
    
    public String mess(){
        String mess = "Hej från metod";
        return mess;
        
    }//end test
    
    public double rekord(double langd, double vind){
        
        double svar;
        if (vind <= 2.0 && langd > 8.95) {
            svar = langd - 8.95;
            
        }
        else{
            svar = langd - 8.95;
        }
        
        return svar;
        
    }//end rekord
    
    public boolean hopp(double l, double v){
        boolean svar;
        if (v <= 2.0 && l > 8.95) {
            svar = true;
            
        }
        else{
            svar = false;
        }
        return svar;
        
    }//end hopp

}//end main
