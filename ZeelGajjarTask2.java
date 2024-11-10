package Assignment3;
import java.util.*;

/**
 *
 * @author 2474008
 */

public class ZeelGajjarTask2 {

    public static void main(String[] args) {
        
        Scanner info = new Scanner(System.in);

        //Promting user for information
        System.out.print("Please enter a word: ");
        String word = info.nextLine();

        System.out.println("Please choose the case you want to convert:");
        System.out.println("1. 'l' or 'L' for lowercase");
        System.out.println("2. 'u' or 'U' for uppercase");
        System.out.println("3. 't' or 'T' for titlecase");
        char letter = info.next().charAt(0);

        System.out.println();

        //Invoking the methods and printing the results
        System.out.printf("%-37s: %s \n", "Original word", word);

        String resultOf1 = convertCase(word);
        System.out.printf("%-37s: %s \n", "Calling the first convertCase method", resultOf1);

        String resultOf2 = convertCase(word, letter);
        System.out.printf("%-37s: %s \n", "Calling the second convertCase method", resultOf2);
    }

    //First Method - Disecting the word, altering it, and merging it for the return result
    public static String convertCase(String wrd){
        
        String firstLetter = wrd.substring(0,1);
        String restOfWrd = wrd.substring(1);
        
        String LowerRestOfWrd = restOfWrd.toLowerCase();
        String titleCase = firstLetter.toUpperCase();
        
        return titleCase + LowerRestOfWrd; 

    }

    //Second Method- Using switch case to determine the next step to alter the word
    public static String convertCase(String wrd, char chr){
        
        switch(chr){
            
            case 'u':
            case 'U':
                return wrd.toUpperCase();
                
            case 'l':
            case 'L':
                return wrd.toLowerCase();
            
            case 't':               
            case 'T':
                convertCase(wrd);
            
            default: 
                return "Error";
        }

    }

}

