/* ICS4U
 * Tower of Hanoi
 * Lawrence Pang
 * 29/09/2015
 */

import java.util.*;

public class Queens {
    public static boolean returned;
    
    public static boolean isConsistent(int[] q, int n) {
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

    public static void enumerate(int N) {
        int[] a = new int[N];
        enumerate(a, 0);
    }

    public static boolean enumerate(int[] q, int n) {
        if (returned) return true;
        int x = q.length;
        if (n == x) {
            printQueens(q);
            returned = true;
        }
        else {
            for (int i = 0; i < x; i++) {
                q[n] = i;
                if (isConsistent(q, n)) 
                    enumerate(q, n+1);
            }
        }
        return false;
    }  

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        returned = false;
        System.out.println ("Enter the side length of the chessboard (works well for n<25).");
        int n = s.nextInt();
        enumerate(n);
    }
}