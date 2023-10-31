import java.io.*;
import java.util.*;
public class Triangle{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int sum=a+b+c;
if(sum>=180)
{
System.out.println("Triangle is formed");
}
else{
System.out.println("Triangle is not formed");
}
}
}