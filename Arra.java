import java.io.*;
import java.util.*;
public class Arra
{
public static void main(String[] args)
{
int i,n;
System.out.println("Enter n");
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("Enter the number");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
System.out.println("The numbers are;"+a[i]);
}
}
}
