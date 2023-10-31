
import java.io.*;
import java.util.*;
class Studentcon
{
int id;
String num;
Studentcon(int i,String n)
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
Studentcon s1=new Studentcon(1,"arun");
Studentcon s2=new Studentcon(2,"swetha");
s1.display();
s2.display();
}
}