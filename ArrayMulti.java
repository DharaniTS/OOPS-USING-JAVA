import java.io.*;
import java.util.*;
public class ArrayMulti
{
public static void main(String[] args)
{
int i,n,mul=1;
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
mul=mul*a[i];
}
System.out.println(mul);
}
}