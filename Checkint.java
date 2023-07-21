import java.util.*; 
import java.io.*; 
 public class Checkint{
 public static void main(String[] args)
 {
    int[] a = {50, 77, 12, 54, -11};
	System.out.println("Original Array: "+Arrays.toString(a)); 
	System.out.println("Result: "+test(a));
    }	
    public static boolean test(int[] numbers) {
    for (int number : numbers) {
      if (number == 0 || number == -1) {
        return false;
      }
    }
    return true;
  }  
}