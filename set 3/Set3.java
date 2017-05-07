/* ICS4U
 * Set 3 programs
 * Lawrence Pang
 * 14/09/2015
 */

import java.util.*;
/**
 * Write a description of class Set3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Set3
{
     public static void pressAnyKeyToContinue()
     { 
        //press enter to continue
        System.out.println("\nPress enter to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
    
    public static void Product ()
    {
        //variable declaration
        int num, value;
        int prod = 1;
        Scanner s = new Scanner (System.in);
        
        //prompt for number of values to process
        System.out.print ("How many numbers to process? ");
        num = s.nextInt();
        
        //prompt for values
        System.out.println ("Enter "+num+" positive integers");
        for (int i = 0; i<num; i++)
        {
            System.out.print ("#"+i+": ");
            value = s.nextInt();
            
            //calculate product
            if (value<=0)
                System.out.println (value+" not counted");
            else
                prod = prod*value;
        }
        
        //output product
        System.out.println ("\nThe product of the positives is "+prod+".");
        pressAnyKeyToContinue();
    }
    
    public static void Factorial ()
    {
        //variable declaration
        int num;
        int factorial = 1;
        Scanner s = new Scanner (System.in);
        
        //prompt for factorial number
        System.out.print ("Enter a non-negative integer: ");
        num = s.nextInt();
        System.out.println ();
        
        if (num>=0&&num<=12)
        {
            for (int i = num; i>0; i--)
            {
                if (i == 1)
                    System.out.print ("1 = ");
                else
                    System.out.print (i+" x ");
                    
                //calculate factorial
                factorial = factorial*i; 
            }
            
            //output factorial
            System.out.print (factorial);
        }
        else
            System.out.println ("Please enter an integer within range (0-12 inclusive).");
        pressAnyKeyToContinue();
    }
    
    public static void Invest ()
    {
        //variable declaration
        double deposit, rate;
        double balance = 0;
        double interest = 0;
        int term;
        Scanner s = new Scanner (System.in);
        
        //prompt for deposit, rate, and term
        System.out.print ("Monthly Deposit\t\t\t:  ");
        deposit = s.nextDouble();
        System.out.print ("Annual Interest Rate (%)\t:  ");
        rate = s.nextDouble()/12;
        System.out.print ("Term (Months)\t\t\t:  ");
        term = s.nextInt();
        System.out.println ("Starting\tInterest\tMonthly\t\tEnding");
        System.out.println ("Balance\t\tEarned\t\tDeposit\t\tBalance");
        System.out.println ("--------\t--------\t--------\t--------");
        
        //calculate and display balance and interest
        for (int i = 0; i<term; i++)
        {
            interest = rate*balance/100;
            System.out.format("%10.2f", balance);
            System.out.format("%16.2f", interest);
            System.out.format("%16.2f", deposit);
            balance = balance+interest+deposit;
            System.out.format("%16.2f", balance);
            System.out.println ();
        }
        pressAnyKeyToContinue();
    }
    
    public static void main (String[] args)
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        int c;
        do
        {
            //prompt for choice
            System.out.println ("Enter 1 for product program, 2 for factorial program, 3 for invest program, 4 to quit.");
            c = s.nextInt();
            System.out.print ('\u000c');
            if (c==1) Product();
            if (c==2) Factorial();
            if (c==3) Invest();
            System.out.print ('\u000c');
        }
        while (c!=4);
    }
}

