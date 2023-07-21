import java.io.*;
import java.util.*;
public class Als
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
int lar=a[0];
int sma=a[0];
for(i=0;i<n;i++)
{
 if(lar<a[i])
{
lar=a[i];
}
else if(sma>a[i])
{
sma=a[i];
}
}
System.out.println(lar);
System.out.println(sma);
}
}