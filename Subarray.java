import java.io.*;
import java.util.*;
public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean[] exists = new boolean[n];
        int[] max_not_exists = new int[n];
        max_not_exists[0] = n;

        for (int i = 0; i < n; i++) {
            exists[a[i]-1] = true;
            while (max_not_exists[0] > 0 && exists[max_not_exists[0]-1]) {
                max_not_exists[0]--;
            }
            int[] temp = new int[n];
            System.arraycopy(max_not_exists, 0, temp, 1, n-1);
            temp[0] = max_not_exists[0];
            max_not_exists = temp;
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int max_left = (l > 1) ? max_not_exists[l-2] : n;
            int max_right = (r == n) ? max_not_exists[n-1] : max_not_exists[r];
            System.out.println(Math.max(max_left, max_right));
        }
    }
}