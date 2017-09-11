/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining1;

import java.util.Scanner;

/**
 *
 * @author Blo
 */
public class JavaTraining1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double x;
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Please introduce your first number:");
        
        if (inp.hasNextDouble()) {
            x = inp.nextDouble();
            System.out.println( Math.sin(x) +  Math.cos(x));
            
        }else{
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        }
    }
    
}
