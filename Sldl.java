import java.util.Scanner;

public class Sldl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};

        int[] result1 = new int[5];
        char[] result2 = new char[5];

        for (int i = 0; i < a.length; i++) {
            result1[i] = a[i] * b[i];
            if (result1[i] < 10) {
                result2[i] = 's';
            } else {
                result2[i] = 'd';
            }
            if (result1[i] % 2 == 0) {
                result2[i] = 'e';
            }
            if (result1[i] % 2 != 0) {
                if (result2[i] == 'e') {
                    result2[i] = 'n';
                } else {
                    result2[i] = 'o';
                }
            }
        }

        System.out.print("Output 1: ");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        System.out.print("       ");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + "  ");
        }
        System.out.println();
    }
}
