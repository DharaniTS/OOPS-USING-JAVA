import java.io.*;
import java.util.*;
public class Fibonacci{
public static void main(String[] args)
{
int n;
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int x=0,y=1;
for (int i = 1; i <= n; ++i){
System.out.println(x+",");
int z=x+y;
x=y;
y=z;
System.out.println(" The series till " + n + " are: ");
}
}
}
