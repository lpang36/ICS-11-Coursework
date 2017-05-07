/* ICS4U
 * Set 4 programs
 * Lawrence Pang
 * 15/09/2015
 */

import java.util.*;
/**
 * Write a description of class Set3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Set4
{
    public static void HiLo ()
    {
        //variable declaration
        int num, memory;
        int points = 0;
        char guess;
        Scanner s = new Scanner (System.in);
        
        //calculate number
        num = (int)(Math.random()*100)+1;
        do
        {
            memory = num;
            
            //prompt for guess
            System.out.print ("The number is "+num+". Next one? (h/l) ");
            guess = s.nextLine().charAt(0);
            
            //calculate number, points
            num = (int)(Math.random()*100)+1;
            points++;
        }
        while ((guess=='h'&&num>memory)||(guess=='l'&&num<memory));
        
        //display number of points
        System.out.println("The number is "+num+". You scored "+points+" points.");
        s.nextLine();
    }
    
    public static void BankAccount ()
    {
        //variable declaration
        double balance, deposit, withdrawal;
        int month = 1;
        Scanner s = new Scanner (System.in);
        
        //prompt for balance
        System.out.print ("Starting balance: ");
        balance = s.nextInt();
        System.out.println ();
        
        //prompt for deposits and withdrawals
        while (true)
        {
            if (balance<0) break;
            System.out.print ("Month #"+month+"\tDeposits: ");
            deposit = s.nextInt();
            if (deposit==-1) break;
            System.out.print ("\t\tWithdrawals: ");
            withdrawal = s.nextInt();
            System.out.println ();
            
            //calculate balance
            balance = balance+deposit-withdrawal;
            month++;
        }
        
        //display balance
        System.out.printf ("You have $%.2f left.",balance);
        s.nextLine();
    }
    
    public static void Invest2 ()
    {
        //variable declaration
        double deposit, rate, target;
        double balance = 0;
        double interest = 0;
        int term = 0;
        Scanner s = new Scanner (System.in);
        
        //prompt for deposit, rate, and term
        System.out.print ("Monthly Deposit\t\t\t:  ");
        deposit = s.nextDouble();
        System.out.print ("Annual Interest Rate (%)\t:  ");
        rate = s.nextDouble()/12;
        System.out.print ("Target Value\t\t\t:  ");
        target = s.nextInt();
        
        //calculate and display balance and deposit
        System.out.println ("Starting\tInterest\tMonthly\t\tEnding");
        System.out.println ("Balance\t\tEarned\t\tDeposit\t\tBalance");
        System.out.println ("--------\t--------\t--------\t--------");
        while (balance<target)
        {
            interest = rate*balance/100;
            System.out.format("%10.2f", balance);  
            System.out.format("%16.2f", interest);
            System.out.format("%16.2f", deposit);
            balance = balance+interest+deposit;
            System.out.format("%16.2f", balance);
            System.out.println ();
            term++;
        }
        
        //display terms needed to reach target
        System.out.println ("It took "+term+" months to reach your target.");
        s.nextLine();
    }
    
    public static void main (String[] args)
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        int c;
        do
        {
            //prompt for choice
            System.out.println ("Enter 1 for hilo program, 2 for bankaccount program, 3 for invest2 program, 4 to quit.");
            c = s.nextInt();
            System.out.print ('\u000c');
            if (c==1) HiLo();
            if (c==2) BankAccount();
            if (c==3) Invest2();
            System.out.print ('\u000c');
        }
        while (c!=4);
    }
}
