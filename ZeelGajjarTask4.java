package Assignment3;
import java.util.*;
/**
 *
 * @author 2474008
 */

public class ZeelGajjarTask4 {

    public static void main(String[] args) {
       
        Coin c = new Coin(); // Creating the Coin class
        
        Scanner input = new Scanner(System.in);
        
        //Promting user to choose
        System.out.println("1. Toss Coin");
        System.out.println("2. Exit");
        System.out.print("Choice: ");
        int num = input.nextInt();
        
        //Looping until the user enters 2
        while (num == 1) {
            c.tossCoin(); //Tossing the coin and updating the counts of heads and tails
            System.out.printf("Heads: %d, Tails: %d \n", c.num1, c.num2); //Displaying the current results
            
            //Promting the user again to choose and reading the user's choice
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            num = input.nextInt();
        }
    }
    
    //Coin class
    public static class Coin{
        int num1 ;
        int num2 ;
        
        Coin(){
        }
        
        void tossCoin(){
            if (flip()) {
                num1++;
            } else {
                num2++;
            }
        }
        
    }
    
    // Generating random values between 1 and 0 and returns a boolean value based on that
    public static boolean flip() { 
        Random rand = new Random();
        int num = rand.nextInt(2);
        if(num == 1){
            return true;
        } else {
            return false;
        }
    }
}
    
