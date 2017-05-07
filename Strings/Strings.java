/* ICS4U
 * Strings programs
 * Lawrence Pang
 * 22/09/2015
 */

import java.util.*;
import java.lang.*;

public class Strings
{
    public static boolean palindrome (String input)
    {
        //variable declaration
        String newString = "";
        
        //newString is a copy of input with non-letters or numbers removed
        for (int i = 0; i<input.length(); i++)
        {
            if (java.lang.Character.isDigit(input.charAt(i)) || java.lang.Character.isLetter(input.charAt(i)))
                newString += java.lang.Character.toLowerCase(input.charAt(i));
        }
        
        //checks if each character matches up with the one on the opposite end of the string
        for (int i = 0; i<newString.length()/2; i++)
        {
            if (newString.charAt(i)!=newString.charAt(newString.length()-i-1))
                return false;
        }
        
        //if all characters match up, input is a palindrome
        return true;
    }
    
    public static String shiftcode (int shift, String input)
    {
        //variable declaration
        String output = "";
        
        //loop through input
        for (int i = 0; i<input.length(); i++)
        {
            //capital letters
            //adds shift to each character
            //wraps around to the start using modulus
            if (input.charAt(i)>64 && input.charAt(i)<91)
                output += (char)((input.charAt(i)+shift-12)%26+64);
            //lowercase letters
            //adds shift to each character
            //wraps around to the start using modulus
            else if (input.charAt(i)>96 && input.charAt(i)<123)
                output += (char)((input.charAt(i)+shift-18)%26+96);
            //other characters
            //nothing is changed
            else
                output += input.charAt(i);
        }
        
        return output;
    }
    
    public static String cryptocode (String input)
    {
        //variable declaration
        ArrayList scrambled = new ArrayList();
        String output = "";
        int random;
        
        //creates an arraylist which is the scrambled alphabet
        //uses numbers 0-25 instead of letters A-Z
        for (int i = 0; i<26; i++)
        {
            //inserts each number from 0-25 at a random location in the arraylist
            random = (int)(Math.random()*(i+1));
            scrambled.add (random, i);
        }
        
        //loops through input
        for (int i = 0; i<input.length(); i++)
        {
            //capital letters
            //finds the corresponding letter in the scrambled alphabet and outputs that
            if (input.charAt(i)>64 && input.charAt(i)<91)
                output += (char)((int)(scrambled.get(input.charAt(i)-65))+65);
            //lowercase letters
            //finds the corresponding letter in the scrambled alphabet and outputs that
            else if (input.charAt(i)>96 && input.charAt(i)<123)
                output += (char)((int)(scrambled.get(input.charAt(i)-97))+97);
            //other characters
            //nothing is changed
            else
                output += input.charAt(i);
        }
        
        return output;
    }
    
    public static void palindromeTest ()
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        String input;
        boolean isPalindrome;
        
        //prompt for input
        System.out.println ("Please enter a string.");
        input = s.nextLine();
        
        //find if input is a palindrome
        isPalindrome = palindrome (input);
        
        //display result
        System.out.println ("It is "+isPalindrome+" that "+input+" is a palindrome.");
        input = s.nextLine();
        input = s.nextLine();
    }
    
    public static void shiftcodeTest ()
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        String input, output;
        int shift;
        
        //prompt for input and shift
        System.out.println ("Please enter a string.");
        input = s.nextLine();
        System.out.println ("Please enter the shift.");
        shift = s.nextInt();
        
        //find shifted message
        output = shiftcode (shift, input);
        
        //display shifted message
        System.out.println ("The shifted message is "+output);
        input = s.nextLine();
        input = s.nextLine();
    }
    
    public static void cryptocodeTest ()
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        String input, output;
        
        //prompt for input
        System.out.println ("Please enter a string.");
        input = s.nextLine();
        
        //find encrypted message
        output = cryptocode (input);
        
        //display encrypted message
        System.out.println ("The shifted message is "+output);
        input = s.nextLine();
        input = s.nextLine();
    }
    
    public static void main (String[] args)
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        int c;
        do
        {
            //prompt for choice
            System.out.println ("Enter 1 for palindrome program, 2 for shiftcode program, 3 for cryptocode program, 4 to quit.");
            c = s.nextInt();
            System.out.print ('\u000c');
            if (c==1) palindromeTest();
            if (c==2) shiftcodeTest();
            if (c==3) cryptocodeTest();
            System.out.print ('\u000c');
        }
        while (c!=4);
    }
}