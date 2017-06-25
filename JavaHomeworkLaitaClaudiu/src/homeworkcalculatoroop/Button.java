package homeworkcalculatoroop;

import java.util.Scanner;

/**
 * My first Java program.
 * Calculator
 * VERSION 0.0.0.0.0.2
 * @author Claudiu Laita
 */
public class Button extends Screen{
    
    private static double num1;
    private static double num2;
    private static String sum;
    public static Scanner inp = new Scanner(System.in);

    public static void compute(){
        
        firstNumber();
        operator();
        secondNumber();
        eqsOperator();
        
        
    }
    // Allows the input of the first number and checks if it is valid;
    public static void firstNumber() {
        askFirst();
        if (inp.hasNextDouble()) {
            num1 = inp.nextDouble();
        }else if(inp.next().equals("clear")){
            clear();
        }else{
            displayErr1();
        }
    }
    
    //Allows the input of the operator 
    public static void operator(){
        askOperator();
        sum = inp.next();
        switch (sum) {
            case "-":
            case "+":
            case "*":
            case "/":
                break;
            case "clear":
                clear();
                break;
            default:
                displayErr1();
                break;
        }
    }
    
    //Allows the input of the second number and checks if it is valid;
    public static void secondNumber() {
        askSecond();
        if (inp.hasNextDouble()) {
            num2 = inp.nextDouble();
        }else if(inp.next().equals("clear")){
            clear();
        }else{
            displayErr1();
        }
    }
    
    /*Allows the input of the "=" operator and checks if it is valid,
        and also shows the result if everything is ok;*/  
    public static void eqsOperator(){
        askEquals();
        if(inp.next().equals("clear")){
            clear();
        }else if(null == sum){
            displayErr1();
        }else switch (sum) {
            case "+":
                display = num1 + num2;
                break;
            case "-":
                display = num1 - num2;
                break;
            case "*":
                display = num1 * num2;
                break;
            case "/":
                display = num1 / num2;
                break;
            default:
                displayErr1();
                break;
        } 
    }
}
    
    
