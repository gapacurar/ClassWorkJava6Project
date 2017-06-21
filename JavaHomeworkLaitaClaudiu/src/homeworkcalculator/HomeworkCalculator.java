/**
 * My first Java program
 * A simple calculator which is supposed to display if you entered wrong numbers
 * And to quit if you insert wrong operators
 */
package homeworkcalculator;

import java.util.Scanner;

/**
 *
 * @author Claudiu Laita
 */


public class HomeworkCalculator {
  public static void main(String[] arguments){
      
      double num1;
      double num2;
      String sum;
      String eq;

      // Allows the input of the first number and checks if it is valid;
      Scanner inp = new Scanner(System.in);
      do {
         System.out.println("Please introduce your first number:");
         while (!inp.hasNextDouble()) {
             System.out.println("Sorry, you introduced wrong data instead of the first number. Try again");
             inp.next(); 
            }
            num1 = inp.nextDouble();
        } while (num1 != (double)num1);
      
      //Allows the input of the operator 
      Scanner operator = new Scanner(System.in);
      System.out.println("Please introduce operator(+/-/*//)");
      sum = operator.next();
      
      //Allows the input of the second number and checks if it is valid;
      do {
         System.out.println("Please introduce your second number:");
         while (!inp.hasNextDouble()) {
             System.out.println("Sorry, you introduced wrong data instead of the second number. Try again");
             inp.next(); 
            }
            num2 = inp.nextDouble();
        } while (num2 != (double)num2);
      
      //Allows the input of the = operator;
          Scanner equals = new Scanner(System.in);
          System.out.println("Please introduce =");
          eq = equals.next();
      
      /*Checks and specifies if any operator is invalid 
        and also show the result if everything is ok;*/    
          if(eq.equals("=")){
              if(sum.equals("+")){
                 System.out.println("Result is " + (num1+num2));
                 }else if(sum.equals("-")){
                     System.out.println("Result is " + (num1-num2));
                 }else if(sum.equals("*")){
                     System.out.println("Result is " + (num1*num2));
                 }else if(sum.equals(":")){
                     System.out.println("Result is " + (num1/num2));
                 }else if(sum.equals("/")){
                     System.out.println("Result is " + (num1/num2));
                 }else{
                     System.out.println("Sorry, you introduced wrong data instead of an +,-,*,/ operator. I quit :)");
                 }
          }else{
             System.out.println("Sorry, you introduced wrong data instead of = . I quit :)");
          }
    }
}

