/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kap1_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Max Andersson
 */
public class Skivor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.##");
        
        
        int antalSkivor;
        String formateratTal;
        
        System.out.println("En skiva kostar 9.90 kr styck.");
        System.out.println("Du får mängdrabatt.");
        System.out.println("Köper du 10 eller mer får du 5% rabatt");
        System.out.println("Köper du 50 eller mer får du 10% rabatt");
        System.out.println("Köper du 100 eller mer får du 15% rabatt");
        System.out.print("Hur många har du skivor har du köpt? ");
        
        antalSkivor = sc.nextInt();
            double skivpris;
            skivpris = antalSkivor * 9.90;
               
            
        if (antalSkivor >= 100){
            skivpris = skivpris * 0.85;
            formateratTal = d.format(skivpris);
            System.out.println("Du får 15% rabatt.");
            System.out.println("Du betalar: " + formateratTal +"kr");
        }
        else if (antalSkivor >= 50){
            skivpris = skivpris * 0.90;
            formateratTal = d.format(skivpris);
            System.out.println("Du får 10% rabatt.");
            System.out.println("Du betalar: " + formateratTal +"kr");
    }
        else if (antalSkivor >= 10){
            skivpris = skivpris * 0.95;
            formateratTal = d.format(skivpris);
            System.out.println("Du får 5% rabatt.");
            System.out.println("Du betalar: " + formateratTal +"kr");
        }
        else {
            formateratTal = d.format(skivpris);
            System.out.println("Ingen rabatt, du betalar fullpris, dvs: " + formateratTal);
        }
            
        
    }//end main

}//end class
