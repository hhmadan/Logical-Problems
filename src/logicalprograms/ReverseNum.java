package logicalprograms;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Enter the number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number before reversing is: "+n);
        displayReverse(n);
    }
    public static void displayReverse(int n) {
        int rev = 0, rem = 0;
        while (n > 0)
        {
            rem = n % 10;
            rev = (rev * 10)+rem;
            n = n / 10;
        }
        System.out.println("Number after reversing is: "+rev);
    }
}

