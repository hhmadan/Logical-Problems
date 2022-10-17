package logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter number to be checked: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        prime(num);
    }
    public static void prime(int num){
        boolean bool = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                bool = true;
                break;
            }
        }
        if (!bool)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is NOT a prime number");
    }
}
