import java.io.*;
class Studentc
{
int id;
String name;
float fees;
void InsertRecord(int i, String n,float f)
{
id=i;
name=n;
fees= f;
}
void displayInformation()
{
System.out.println(id+" "+name+" "+fees);
}
}
 class TestStudent3
{
public static void main(String[] args)
{

Studentc s1=new Studentc();
Studentc s2=new Studentc();

s1.InsertRecord(110,"Dharani",900000);
s2.InsertRecord(111,"Anu",900000);

s1.displayInformation();
s2.displayInformation();

}
}