import java.io.*;
import java.util.*;
public class Factorial
{
public static void main(String[]args)
{
int n;
System.out.printf("enter");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int Factorial=1;
int i=1;
while(i<=n){
Factorial=Factorial*i;
i++;
}
System.out.printf("The number is %d",Factorial);
}}