import java.io.*;
import java.util.*;
public class Sumpro
{
public static void main(String[] args)
{
int i,n,sum=0,product=1;
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
sum=sum+a[i];
}
System.out.println(sum);
for(i=0;i<n;i++)
{
product=product*a[i];
}
System.out.println(product);
int q;
System.out.println("Enter q");
q=s.nextInt();
if(q==1)
{
System.out.println(sum);
}
else if(q==2)
{
System.out.println(product);
}
}
}