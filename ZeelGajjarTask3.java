package Assignment3;
import java.util.*;

/**
 *
 * @author 2474008
 */


public class ZeelGajjarTask3 {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        //Asks user to put the no. and base and converts it from a string to integers
        System.out.print("Please enter a number and a base, separated by space: ");
        String nums1 = info.nextLine();
        int spaceIndex1 = nums1.indexOf(' ');
        int num1 = Integer.parseInt(nums1.substring(0, spaceIndex1));
        int base = Integer.parseInt(nums1.substring(spaceIndex1 + 1));


        //Displaying whether or not it is divisible by the base
        if (isDivisible(num1, base)) {
            System.out.printf("%d is divisible by %d\n", num1, base);
        } else {
            System.out.printf("%d is not divisible by %d \n", num1, base);
        }
        
       System.out.println("");


        //Promting user to enter English letter num, base, and English letter base; and getting the values of the inputs
        System.out.print("Please enter an English letter: ");
        char letter = info.next().charAt(0);
        info.nextLine(); 
    
        System.out.print("Please enter a number base and an English letter base, separated by space: ");
        String nums2 = info.nextLine();
        
        int spaceIndex2 = nums2.indexOf(' ');
        int num3 = Integer.parseInt(nums2.substring(0, spaceIndex2));
        char characterBase = nums2.charAt(spaceIndex2 + 1);
    
        System.out.println("");


        //Calling the methods to confirm wheather or not it's divisible by the bases and printing the results
        if (isDivisible(letter, num3)) {
            System.out.printf("'%c' is divisible by %d\n", letter, num3);
        } else {
            System.out.printf("'%c' is not divisible by %d\n", letter, num3);
        }
    
        if (isDivisible(letter, characterBase)) {
            System.out.printf("'%c' is divisible by '%c'\n", letter, characterBase);
        } else {
            System.out.printf("'%c' is not divisible by '%c'\n", letter, characterBase);
        }

    }
    
    // Method #1 - Takes a string and turns it to integer
    public static int letterToNum(char c){
        
        return Character.getNumericValue(c);
    }

    // Method #2 - Takes a num and returns a boolean value based on the number's divisibilty to 3
    public static boolean isDivisible(int num){
        
        if(num % 3 == 0){
            return true;
        } else {
            return false;
        }
    }   

    // Method #3 - takes a num and a base num, returns a boolean value based on the number's divisibility to the base num 
    public static boolean isDivisible(int num, int base){
       
        if(num % base == 0){
            return true;
        } else {
            return false;
        }
    }

    // Method #4 - takes a char, turns it into an interger, checks wheather or not the integer is divisible by 3, and returns a boolean value
    public static boolean isDivisible(char letter){
       
        int num = letterToNum(letter);
        return isDivisible(num);
    }

    // Method #4 - takes a char and a base num, turns char into an interger, checks wheather or not the integer is divisible by the base num, and returns a boolean value
    public static boolean isDivisible(char letter, int base){

        int num = letterToNum(letter);
        return isDivisible(num, base);
    }

    // Method #4 - takes a char num and a base num, turns both into intergers, checks wheather or not the num is divisible by the base, and returns a boolean value
    public static boolean isDivisible(char letter, char base){
      
        int num = letterToNum(letter);
        int numBase = letterToNum(base);
        return isDivisible(num, numBase);
    }

}

