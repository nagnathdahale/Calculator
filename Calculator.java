import java.util.Scanner;
import java.lang.Math;

public class Calculator {
static Scanner scanner;
    public static void main(String[] args) {
       
        
        while(true)
            
        { 
        System.out.println("Please enter your calculation "); 
                
        scanner = new Scanner(System.in);  

        
        double left = scanner.nextDouble();  //taking 1st input from user
        String op = scanner.next();          // taking operator from user
        if (op.equals("e"))
        {
        break;
            }
        double right = scanner.nextDouble(); //taking second digit from user
        System.out.println(compute(left, op, right));
    }
    }
    private static double compute(double left, String op, double right)
    
    {
        
        switch (op.charAt(0)) 
        
        
        {
            case  '+':                  //performing operation
            return left + right;
        case  '-':
            return left - right;
        case  '*':
            return left * right;
        case  '/':
            return left / right;
        case '^':
            return Math.pow(left,right);
        case 'l' :
            return Math.log(left);
       
                   
                    
        }
        throw new IllegalArgumentException("Unknown operator:" + op);
    }
}
