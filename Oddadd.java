import java.io.*;
import java.util.*;
public class Oddadd
{
public static void main(String[]args)
{
int n;
System.out.printf("enter");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int Oddadd=0;
int i=1;
while(i<=n){
Oddadd=Oddadd+i;
i=i+1;
}
System.out.printf("%d",Oddadd);
}}