import java.io.*;
import java.util.*;
public class Evenadd
{
public static void main(String[]args)
{
int n;
System.out.printf("enter");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int sum=0;
int i=0;
while(i<=n){
sum=sum+i;
i=i+2;
}
System.out.printf("%d",sum);
}}