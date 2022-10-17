package logicalprograms;

import java.util.Scanner;

public class PerfectNumber{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        perfectNum(n);
    }
    public static void perfectNum(int n) {
        int divisorsSum = 0;
        for (int i = 1; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                System.out.println(i);
                divisorsSum += i;
            }
        }
        if ( n == divisorsSum)
            System.out.println(n+" is a Perfect Number");
        else
            System.out.println(n+" is not a Perfect Number");
    }
}
