/* For this in-class assignment, you are to complete the program by writing these methods so that
   the program can produce the output shown.

   I would suggest that you write near-empty methods with return statements first to get the
   program running, then work on the problems themselves.

   1. numwords accepts a string, then returns the number of "words" separated by one or more
      spaces (ex. "Hey,   it's R2D2!"  is 3 words)

   2. shuffle accepts a string, then returns the same characters with all the vowels first,
      followed by all the consonants then all the other characters in their original "order".
      (ex. "This is like a test!"  changes to  "iiieaeThsslktst    !"

   3. edit accepts a string, then returns it with duplicate characters eliminated from the
      string (ex. "Madam, I'm Adam!"  returns  "Madm, I'A!")

   YOU ARE NOT ALLOWED TO CHANGE THE MAIN PROGRAM (except for testing purposes).
*/
import java.util.Scanner;

public class InclassOct2015
{
    static Scanner sc;
    
    public static int numwords (String input)
    {
        boolean space = false;
        int count = 1;
        for (int i = 0; i<input.length(); i++)
        {
            if (input.charAt(i) == ' ')
                space = true;
            if (space && input.charAt(i) != ' ')
            {
                count++;
                space = false;
            }
        }
        return count;
    }
    
    public static String shuffle (String input)
    {
        String vowels = "";
        String consonants = "";
        String other = "";
        for (int i = 0; i<input.length(); i++)
        {
                        if (input.charAt(i) == 'a' ||
                                input.charAt(i) == 'e' ||
                                input.charAt(i) == 'i' ||
                                input.charAt(i) == 'o' ||
                                input.charAt(i) == 'u' ||
                                input.charAt(i) == 'A' ||
                                input.charAt(i) == 'E' ||
                                input.charAt(i) == 'I' ||
                                input.charAt(i) == 'O' ||
                                input.charAt(i) == 'U' )
                        {
                            vowels+=input.charAt(i);
                        }
                        else if ((input.charAt(i)>='a' && input.charAt(i)<='z') || (input.charAt(i)>='A' && input.charAt(i)<='Z'))
                            consonants+=input.charAt(i);
                        else other+=input.charAt(i);              
        }
        return vowels+consonants+other;
    }
    
    public static String edit (String input)
    {
        String eliminate = "";
        String output = "";
        for (int i = 0; i<input.length(); i++)
        {
            if (eliminate.indexOf(input.charAt(i)) == -1)
            {
                output += input.charAt(i);
                eliminate += input.charAt(i);
            }
        }
        return output;
    }

    public static void main (String[] args)
    {
        sc = new Scanner (System.in);

        System.out.print ("\n\nEnter a multi-word message: ");
        String message = sc.nextLine ();

        System.out.println ("\nThe message has " + numwords (message) + " words.");

        System.out.println ("\nThe shuffled version is: " + shuffle (message));

        System.out.println ("\nThe edited version is: " + edit (message));
    } // main method
} // InclassOct2015 class

/* Sample run

   Enter a multi-word message: Too much programming is bad for your teeth!

   The message has 8 words.

   The shuffled version is: oouoaiiaooueeTmchprgrmmngsbdfryrtth       !

   The edited version is: To muchprgainsbdfyte!

*/
