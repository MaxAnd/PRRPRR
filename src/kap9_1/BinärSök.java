

package kap9_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class BinärSök {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] a = {20,23,56,66,89};
        Arrays.sort(a);
        int max, min, t, pos, mitten;
        min = 0;
        max = a.length - 1;
        
        System.out.print("Vilket heltal söker du? ");
        t = sc.nextInt();
        
        pos = -1;
        
        while (min <= max && pos == -1) 
        {
            mitten = (max + min)/2;
            if(t > a[mitten]){
                min = mitten + 1;
            }else if(t < a[mitten]){
                max = mitten - 1;
            }else{
                pos = mitten;
            }
            
        }//end while
        
        if (pos == -1) {
            System.out.println("Talet hittades inte!");
        }else{
            System.out.println("Talet finns elementnummer: " + pos);
        }
        
    }//end main

}//end class
