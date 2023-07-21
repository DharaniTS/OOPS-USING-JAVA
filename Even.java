import java.io.*;
import java.util.*;
public class Even{
public static void main(String[]args){
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
if(num%2==0){
System.out.println("the integer"+num+"is even integer");
}
else{
System.out.println("the integer"+num+"is odd integer");
}}}