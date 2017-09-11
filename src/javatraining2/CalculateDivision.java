/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining2;

import java.util.Scanner;

/**
 *
 * @author Blo
 */
public class CalculateDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double x;
        double y;
        Scanner operator = new Scanner(System.in);
        
        System.out.println("Enter the number to be divided");
        x = operator.nextDouble();
        
        System.out.println("Enter the second number");
        y = operator.nextDouble();
        
        System.out.println("The result is: " + (x/y));
        
    }
    
}
