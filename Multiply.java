import java.io.*;
import java.util.*;
public class Multiply
{
public static void main(String[]args)
{
int n;
System.out.printf("enter");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int Multiply=1;
int i=1;
while(i<=n){
Multiply=Multiply*i;
i++;
}
System.out.printf("%d",Multiply);
}}
