/* ICS4U
 * Set 5 programs
 * Lawrence Pang
 * 17/09/2015
 */

import java.util.*;
/**
 * Write a description of class Set3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Set5
{
    public static void title (String input)
    {
        //variable declaration
        int length = input.length();
        
        //display border
        for (int i = 0; i<length+4; i++)
        {
            System.out.print ("-");
        }
        System.out.println ("\n| "+input+" |");
        for (int i = 0; i<length+4; i++)
        {
            System.out.print ("-");
        }
    }
    
    public static int getRandom (int low, int high)
    {
        //calculate random number
        return (int)((Math.random() * (high-low+1) + low));
    }

    public static char readChar (char low, char high)
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        char output;
        
        //prompt for character
        output = s.nextLine().charAt(0);
        while (output<=low || output>=high)
        {
            System.out.print ("Error "+low+"-"+high+" only: ");
            output = s.nextLine().charAt(0);
        }
        return output;
    }
    
    public static char readChar (String allowed)
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        char output;
        
        //prompt for character
        output = s.nextLine().charAt(0);
        while (allowed.indexOf(output)==-1)
        {
            System.out.print ("Error "+allowed+" only: ");
            output = s.nextLine().charAt(0);
        }
        return output;
    }
    
    public static int lcm (int a, int b)
    {
        //variable declaration
        int i = 1;
        
        //calculate lcm
        while (true)
        {
            if ((i*a)%b==0)
                return i*a;
            else
                i++;
        }
    }
    
    public static void main (String[] args)
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        int pairs, a, b, lcmValue;
        char choice;
        
        do{
            //clear screen
            System.out.print ('\u000c');
            
            //display title
            title ("The LCM Machine");
            
            //prompt for number of values to process
            System.out.print ("\nHow many pairs to process (1-9)? ");
            pairs = readChar ('1', '9')-48;
            
            System.out.printf ("%nNumbers%6s%n","LCM");
            for (int i = 0; i<pairs; i++)
            {
                //generate pairs, calculate lcm
                a = getRandom (1,100);
                b = getRandom (1,100);
                lcmValue = lcm (a,b);
                
                //display pairs, lcm
                System.out.printf ("%3d%4d%6d%n",a,b,lcmValue);
            }
            
            //prompt for go again
            System.out.print ("\nWant to go again? ");
            choice = readChar ("yYnN");
        }
        while (choice == 'y' || choice == 'Y');
    }
}


