import java.io.*;
import java.util.*;
class Conoddeven{
int n;
Conoddeven(int a){
n=a;

if(n%2==0)
{
System.out.println(n+" number is even");
}
else{
System.out.println(n+" number is odd");
}}
public static void main(String[] args){
Scanner s= new Scanner(System.in);
int n=s.nextInt();
Conoddeven o=new Conoddeven(n);
}
}