import java.io.*;
import java.util.*;
public class Split
{  
public static void main(String args[])
{  
Scanner s=new Scanner(System.in);
//get a sentence
String a=s.nextLine();  
//split into words
String[] words=a.split(""); 
//get a word in the sentence to be changed
String str=s.nextLine();
// replace the word with line
String stng=a.replace(str,"_");
//get any two choices
String b=s.nextLine(); 
String c=s.nextLine(); 
//print the replaced sentence and choice
System.out.println(stng);
System.out.println("a)"+b);
System.out.println("b)"+c);
// enter the word from choice that want to be replaced
String dr=s.nextLine();
if(dr.equals(b))
{
	a=stng.replace("_",b);
}
else if(dr.equals(c))
{
   a=stng.replace("_",c);	
}
System.out.println(a);
}
}






































