import java.io.*;
public class Negativedominant
{
public static void main(String []args)
{
int a[]={1,2,3,4,-1,-2,-3,-4,-5,-6};
int p=0;
int n=0;
int i;
for(i=0;i<a.length;i++)
{
if(a[i]>0)
p++;
else
n++;
}
if(n>p)
System.out.println("true");
else
System.out.println("false");
}
}