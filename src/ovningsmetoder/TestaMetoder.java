/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ovningsmetoder;

import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class TestaMetoder {
    
    public static void main(String[] args) {
        
        Support hej = new Support();
        String mottaget = hej.mess();
        System.out.println("Med: " + mottaget);
        
    }

}
