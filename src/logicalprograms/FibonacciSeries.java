package logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        int count;
        System.out.println("Enter Number till Fibonacci Series to be printed...");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        fibonacci(count);
    }
    public static void fibonacci(int count){
        int n1 = 0, n2 = 1, n3, i;
        System.out.println("**** Fibonacci Series is ****");
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
// Program using Recursion...
/*static void printFibonacci(int count){
    if(count>0){
         n3 = n1 + n2;
         n1 = n2;
         n2 = n3;
         System.out.print(" "+n3);
         printFibonacci(count-1);
     }
 }
 public static void main(String args[]){
  int count;
        System.out.println("Enter Number till Fibonacci Series to be printed...");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
  System.out.print(n1+" "+n2);
  printFibonacci(count-2);
 }  */