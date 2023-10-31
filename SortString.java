import java.util.Arrays;
import java.util.Scanner;

public class SortString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string of lower-case characters only: ");
        String string = input.nextLine();

        // Convert the string into a char array
        char[] chars = string.toCharArray();

        // Sort the char array in alphabetical order
        Arrays.sort(chars);

        // Convert the sorted char array back to a string
        String sortedString = new String(chars);

        // Print the sorted string
        System.out.println("Sorted string: " + sortedString);
    }
}
