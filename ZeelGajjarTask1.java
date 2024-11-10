package Assignment3;
import java.util.*;

/**
 *
 * @author 2474008
 */

public class ZeelGajjarTask1 {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        
        //Promting users to input & creating variables for methods
        System.out.print("Please enter two numbers, seperated by space: ");
        String nums1 = info.nextLine(); 
        double numb1 = Double.parseDouble(nums1.substring(0, nums1.indexOf(" ")));
        double numb2 = Double.parseDouble(nums1.substring(nums1.indexOf(" ") + 1));
        
        System.out.print("Please enter the operator (+, -, *, or /): ");
        String operator = info.nextLine();
        char oper = operator.charAt(0);
                
        System.out.print("Please enter a formular, e.g.: \" 3.14 * 2\": ");
        String nums2 = info.nextLine();
        
        
        System.out.println("");
        
        //Invoking the methods & printing the results
        double result = calcResult(numb1, numb2);
        if (result == 0) {
            System.out.println("Error");
        }
        System.out.printf("%-25s : %.2f + %.2f = %.2f \n","Calling the first method", numb1, numb2, result);
        
        double result1 = calcResult(numb1, numb2, oper);
        System.out.printf("%-25s : %.2f %c %.2f = %.2f \n","Calling the second method", numb1, oper, numb2, result1);
 
        double result2 = calcResult(nums2);        
        System.out.printf("%-25s : %s = %.2f","Calling the third method", nums2, result2);
        
    }
   
    //First Method - adding the numbers
    public static double calcResult(double num1, double num2){
        return num1 + num2;
    }
    
    //Second Method - Using switch case to determine which operation to do on the numbers based on the user input
    public static double calcResult(double num1, double num2, char char1){
        switch(char1){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default: 
                return 0;
        }
        
    }
    
    //Third Method - transforming from string to int & doing operations with switch case
     public static double calcResult(String str1){
       
        double num1 = Double.parseDouble(str1.substring(0, str1.indexOf(" ")));
        char char1 = str1.charAt(str1.indexOf(" ") + 1);
        double num2 = Double.parseDouble(str1.substring(str1.indexOf(" ") + 3));
         
         switch(char1){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default: 
                return 0; 
        }
        
    }
        
}
 

