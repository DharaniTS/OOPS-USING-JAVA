import java.io.*;
public class StrongNumbers {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += factorial(lastDigit);
            num /= 10;
        }
        return (sum == originalNum);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
