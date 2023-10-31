import java.util.Arrays;
import java.util.Scanner;

public class WordSorting 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        Arrays.sort(words, (a, b)-> a.compareToIgnoreCase(b) );
        for (String word : words)
			{
            System.out.print(word + " ");
            }
    }
}