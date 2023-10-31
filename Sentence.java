import java.io.*;
import java.util.*;
public class Sentence
{  
public static void main(String args[])
{  
Scanner s=new Scanner(System.in);
String a=s.nextLine();  

String[] words=a.split(""); 
String str=s.nextLine();
String stng=a.replace(str,"_");
String b=s.nextLine();
System.out.println(stng);
System.out.println("a)"+b);
String dr=s.nextLine();
if(dr.equals(b))
{
	a=stng.replace("_",b);
}
System.out.println("the reversed sentence is:");
System.out.println(a);
}
}

