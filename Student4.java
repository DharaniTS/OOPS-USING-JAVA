
import java.io.*;
import java.util.*;
class Student4
{
int id;
String num;
Student4(int i,String n)
{
id=i;
num=n;
}
void display()
{
System.out.println(id+" "+num);
}
public static void main(String[] args)
{
Student4 s1=new Student4(1,"arun");
Student4 s2=new Student4(2,"swetha");
s1.display();
s2.display();
}
}