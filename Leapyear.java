import java.io.*;
import java.util.*;
public class Leapyear{
public static void main(String[]args){
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
if(num%4==0){
System.out.println("the year" +num+ "is leap year");
}
else{
System.out.println("the year" +num+ "is not leap year");
}}}