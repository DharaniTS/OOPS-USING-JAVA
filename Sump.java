import java.io.*;
import java.util.*;
public class Sump
{
public static void main(String[] args)
{
int q,i,n,sum=0,product=1;
System.out.println("Enter");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for (i=1;i<=n;i++)
{
a[i]=s.nextInt();
}
System.out.println(a[i]);
System.out.println("Enter q");
q=s.nextInt();
for (i=1;i<=n;i++)
{
if(q==1)
{
System.out.println(sum=sum+a[i]);
}
else if(q==2)
{
System.out.println(product=product*a[i]);
}
}
}
}

