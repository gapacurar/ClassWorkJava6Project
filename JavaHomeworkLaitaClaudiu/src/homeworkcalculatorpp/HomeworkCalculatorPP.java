/**
 * VERSION 0.0.0.0.0.1
 */
package homeworkcalculatorpp;

import java.util.Scanner;

/**
 * VERSION 0.0.0.0.0.1
 * My first Java program
 * A simple calculator which is supposed to quit if you entered wrong data
 * @author Claudiu Laita
 */
public class HomeworkCalculatorPP {
    
    private static double num1;
    private static double num2;
    private static String sum;
    private static String eqs;
    
    public static void main(String[] args){
      
      firstNumber();
      operator();
      secondNumber();
      eqsOperator();
    }

    // Allows the input of the first number and checks if it is valid;
    public static void firstNumber() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please introduce your first number:");
        if (inp.hasNextDouble()) {
            num1 = inp.nextDouble();
        }else{
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        }
    }
    
    //Allows the input of the operator 
    public static void operator(){
        Scanner operator = new Scanner(System.in);
        System.out.println("Please introduce operator(+/-/*//)");
        sum = operator.next();
        if(sum.equals("-")||sum.equals("+")||sum.equals("*")||sum.equals("/")){
        }else{
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        }
    }
    
    //Allows the input of the second number and checks if it is valid;
    public static void secondNumber() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please introduce your second number:");
        if (inp.hasNextDouble()) {
            num2 = inp.nextDouble();
        }else{
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        }
    }
    
    /*Allows the input of the "=" operator and checks if it is valid,
        and also shows the result if everything is ok;*/  
    public static void eqsOperator(){
        Scanner operator = new Scanner(System.in);
        System.out.println("Please introduce = to show result");
        eqs = operator.next(); 
        if("+".equals(sum)){
            System.out.println("Result is " + (num1+num2));  
        }else if("-".equals(sum)){
            System.out.println("Result is " + (num1-num2));
        }else if("*".equals(sum)){
            System.out.println("Result is " + (num1*num2));
        }else if("/".equals(sum)){
            System.out.println("Result is " + (num1/num2));
        }else{
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        } 
    }
}
