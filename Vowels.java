import java.io.*;
import java.util.*;
public class Vowels 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        int count = 0;
        for (int i = 0; i < str.length(); i++) 
		{
            char c = str.charAt(i);
            if (Character.isLetter(c))
				{
                count++;
            }
        }

        System.out.println("Number of letters: " + count);
    }
}
