import java.io.*;
import java.util.*;

public class Repeatletters 
{
 public static void main(String[] args)
 {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String result = getRepeatedCharacters(input);
    System.out.println(result);
    }
    public static String Repeat(String input) 
	{
        int[] Times = new int[26]; 
        for (char c : input.toCharArray()) 
		{
            Times[c - 'a']++;
        }
         StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (Times[i] > 1) {
                sb.append((char) (i + 'a'));
            }
        }

        return sb.toString();
    }
}
