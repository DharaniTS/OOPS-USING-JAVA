import java.util.Scanner;

public class Sif {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String string = input.nextLine();
    System.out.print("Enter an integer: ");
    int integer = input.nextInt();
    System.out.print("Enter a float: ");
    float decimal = input.nextFloat();
    System.out.println("You entered: " + integer + ", " + decimal + ", and " + string);
  }
}