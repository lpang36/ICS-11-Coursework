/* ICS4U
 * Recursion problems
 * Lawrence Pang
 * 22/09/2015
 */

import java.util.*;
import java.lang.*;

public class Recursion
{
    public static boolean returned;
    
    public static int gcf (int a, int b)
    {
        //calculate gcf
        for (int i = a; i>0; i--)
        {
            //return if both a and b are multiples of i
            if (a%i == 0 && b%i == 0)
                return i;
        }
        return 1;
    }
    
    public static int gcfRecursion (int a, int b)
    {
        //calculate gcf with euclidean algorithm
        if (a == b)
            return a;
        //switches variables so a>b
        else if (a<b)
            return gcfRecursion (b,a);
        return gcfRecursion (b,a-b);
    }
    
    public static int fibonacci (int n)
    {
        //variable declaration
        int a = 1;
        int b = 1;
        int temp;
        
        //first two fibonacci values are 1 and 1
        if (n<=2)
            return 1;
        
        //calculate fibonacci series
        for (int i = 2; i<n; i++)
        {
            temp = a;
            a = b;
            //finds next term in the series
            b += temp;
        }
        return b;
    }
    
    public static int fibonacciRecursion (int n)
    {
        //first two fibonacci values are 1 and 1
        if (n<=2)
            return 1;
        return fibonacciRecursion (n-1) + fibonacciRecursion (n-2);
    }
    
    public static void gcfTest ()
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        int a, b, gcfValue;
        
        //prompt for a, b
        System.out.println ("Please enter two positive integers.");
        a = s.nextInt();
        b = s.nextInt();
        
        //calculate gcf
        gcfValue = gcf (a,b);
        
        //display gcf
        System.out.println ("The GCF of "+a+" and "+b+" is "+gcfValue+".");
        s.nextLine();
        s.nextLine();
    }
    
    public static void gcfRecursionTest ()
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        int a, b, gcfValue;
        
        //prompt for a, b
        System.out.println ("Please enter two positive integers.");
        a = s.nextInt();
        b = s.nextInt();
        
        //calculate gcf
        gcfValue = gcfRecursion (a,b);
        
        //display gcf
        System.out.println ("The GCF of "+a+" and "+b+" is "+gcfValue+".");
        s.nextLine();
        s.nextLine();
    }
    
    public static void fibonacciTest ()
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        int num, fibonacciValue;
        
        //prompt for term number
        System.out.println ("Enter the term number.");
        num = s.nextInt();
        
        //calculate fibonacci number
        fibonacciValue = fibonacci (num);
        
        //display fibonacci number
        System.out.println ("The "+num+"th term of the fibonacci series is "+fibonacciValue+".");
        s.nextLine();
        s.nextLine();
    }
    
    public static void fibonacciRecursionTest ()
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        int num, fibonacciValue;
        
        //prompt for term number
        System.out.println ("Enter the term number.");
        num = s.nextInt();
        
        //calculate fibonacci number
        fibonacciValue = fibonacciRecursion (num);
        
        //display fibonacci number
        System.out.println ("The "+num+"th term of the fibonacci series is "+fibonacciValue+".");
        s.nextLine();
        s.nextLine();
    }
    
    /*********************************************
    N Queens problem methods
    *********************************************/
    //Determines if a queen is being attacked
    public static boolean isConsistent(int[] q, int n) {
        //Checks each row in turn
        for (int i = 0; i < n; i++) 
        {
            if (q[i] == q[n])             
                return false;   // same column
            if ((q[i] - q[n]) == (n - i)) 
                return false;   // same major diagonal
            if ((q[n] - q[i]) == (n - i)) 
                return false;   // same minor diagonal
        }
        return true;
    }

    //Displays solution
    public static void printQueens(int[] q) {
        int x = q.length;
        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < x; j++) 
            {
                if (q[i] == j) 
                    System.out.print("Q ");
                else           
                    System.out.print("* ");
            }
            System.out.println();
        }  
        System.out.println();
    }

    //Overloaded method - converts board size input into array of queen positions (initially all at 0)
    public static void enumerate(int N) {
        int[] a = new int[N];
        enumerate(a, 0);
    }

    //Recursive method
    public static boolean enumerate(int[] q, int n) {
        //If a solution has already been displayed, stop running
        if (returned) return true;
        int x = q.length;
        //Display intermediate steps
        printQueens(q);
        //Stop executing if a solution has been found
        if (n == x) {
            //printQueens(q);
            returned = true;
        }
        //Goes through each queen on each row
        else {
            for (int i = 0; i < x; i++) {
                q[n] = i;
                //If the queen is not being attacked, move on to the next queen
                if (isConsistent(q, n)) 
                    enumerate(q, n+1);
            }
        }
        return false;
    }  
    
    public static void queensTest ()
    {
        Scanner s = new Scanner (System.in);
        returned = false; 
        //Prompt for chess board size
        System.out.println ("Enter the side length of the chessboard (works well for n<25).");
        int n = s.nextInt();
        //Find solution
        enumerate(n);
        s.nextLine();
        s.nextLine();
    }
    /*********************************************/
    
    public static void main (String[] args)
    {
        //variable declaration
        Scanner s = new Scanner (System.in);
        int c;
        do
        {
            //prompt for choice
            System.out.println ("Enter 1 for GCF program without recursion, 2 for GCF program with recursion, 3 for fibonacci program without recursion, 4 for fibonacci program with recursion, 5 for n queens program, 6 to exit.");
            c = s.nextInt();
            System.out.print ('\u000c');
            if (c==1) gcfTest();
            if (c==2) gcfRecursionTest();
            if (c==3) fibonacciTest();
            if (c==4) fibonacciRecursionTest();
            if (c==5) queensTest();
            System.out.print ('\u000c');
        }
        while (c!=6);
    }
}