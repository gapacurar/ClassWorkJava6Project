/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkshowinitials;

import java.util.Scanner;

/**
 *
 * @author Laita Claudiu
 */
public class TheName {
    
    public void askName(){
        //Create a new Scanner
        Scanner sc = new Scanner(System.in);
        //Asks user for their name
        System.out.println("Please enter your entire name here: ");
        //Take the input into a string
        String name = sc.nextLine();
        //Take the string and convert it into an array of strings
        String[] myName = name.split(" ");
        //Store the first character of every word in a string
        String initials = "";
        for (String s : myName) {
            initials = initials + Character.toString(s.charAt(0));
        }
        //Show the initials
        System.out.println("Your initials are: ");
        System.out.println(initials.toUpperCase());
    }
    
}
