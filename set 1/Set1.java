
/**
 * Write a description of class Interest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Set1
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Interest
     */
     public static void pressAnyKeyToContinue()
     { 
        System.out.println("\nPress any key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
    
    public static void Interest()
    {
        Scanner s = new Scanner (System.in);
        System.out.print ("Principal ($): ");
        double principal = s.nextDouble();
        System.out.print ("Interest Rate (%): ");
        double rate = s.nextDouble();
        System.out.print ("\nYear 1 Interest = $"+String.format("%.3g%n",(principal*(rate/100))));
        principal = principal*(1+rate/100);
        System.out.print ("Year 1 Interest = $"+String.format("%.3g%n",(principal*(rate/100))));
        pressAnyKeyToContinue();
    }
    
    public static void Arithmetic()
    {
        Scanner s = new Scanner (System.in);
        System.out.print ("Operand #1: ");
        int a = s.nextInt();
        System.out.print ("Operand #2: ");
        int b = s.nextInt();
        System.out.println ("\n"+a+" + "+b+" = "+(a+b));
        System.out.println (a+" - "+b+" = "+(a-b));
        System.out.println (a+" + "+b+" = "+(a*b));
        double c = a;
        double d = b;
        System.out.println (a+" + "+b+" = "+String.format("%.3g%n",(c/d)));
        pressAnyKeyToContinue();
    }
    
    public static void Receipt()
    {
        Scanner s = new Scanner (System.in);
        System.out.println ("Enter item information\n");
        System.out.print ("Price: ");
        double price = s.nextDouble();
        System.out.print ("Quantity: ");
        int quantity = s.nextInt();
        System.out.println ("-------------------\nHere is your receipt\n");
        System.out.println (quantity+" x "+price+" = $"+(quantity*price));
        System.out.println ("\nThank you. Come again.");
        pressAnyKeyToContinue();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main (String[] args)
    {
        Scanner s = new Scanner (System.in);
        int c;
        do{
        System.out.println ("Enter 1 for interest program, 2 for arithmetic program, 3 for receipt program, 4 to quit.");
        c = s.nextInt();
        System.out.print ('\u000c');
        if (c==1) Interest();
        if (c==2) Arithmetic();
        if (c==3) Receipt();
        System.out.print ('\u000c');
    }
    while (c!=4);
    }
}
