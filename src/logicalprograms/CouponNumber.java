package logicalprograms;

import java.util.Scanner;

public class CouponNumber {
    public static int getCoupon(int n) {
        return (int) (Math.random() * n);
    }
    public static int choice(int n) {
        boolean[] collected = new boolean[n];
        int count = 0;
        int distinct  = 0;

        while (distinct < n) {
            int value = getCoupon(n);
            count++;
            if (!collected[value]) {
                System.out.println(value);
                distinct++;
                collected[value] = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = choice(n);
        System.out.println("Random Numbers generated in order to get "+n+" distinct numbers are..");
        System.out.println(count);
    }
}
