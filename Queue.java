import java.io.*;
import java.util.*;
public class Q
{
public static void main(String[] args)
{
int n,i;
System.out.printf("Enter n");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(i=1;i<=n;i++)
{
a[i]=s.nextInt();
int mi=a[0];
int ma=a[0];
if(mi>=a[i])
{
mi=a[i];
}
}
System.out.printf("mi");
}
}
