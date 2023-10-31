import java.io.*;
class Students
{
int id;
String name;
float fees;
}
class Teststudent
{
public static void main(String[] args)
{
Students s1=new Students();
Students s2=new Students();
s1.id=1;
s1.name="dharani";
s1.fees=100000f;
s2.id=2;
s2.name="manasi";
s2.fees=8000f;
System.out.println(s1.id+" "+s1.name+" "+s1.fees);
System.out.println(s2.id+" "+s2.name+" "+s2.fees);
}
}