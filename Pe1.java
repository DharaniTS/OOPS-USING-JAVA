import java.io.*;
import java.util.*;
public class Pe1
{
public static void main(String args[])
{
int i,sum=0;
int a=1000;
for(i=0;i<a;i++)
{
if(i%3==0 || i%5==0) 
{
sum=sum+i;
}
}
System.out.println(sum);
}
}
