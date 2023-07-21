import java.io.*;
import java.util.*;
public class Admission
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter phyc mark");
int phyc=s.nextInt();
System.out.println("Enter chem mark");
int chem=s.nextInt();
System.out.println("Enter math mark");
int math=s.nextInt();
int Total=phyc+chem+math;
int Tot_total=math+phyc;
if(math>=65 && phyc>=55 && chem>=50);
{
if(Total>=180 || Tot_total>=140)
{
System.out.println("Eligible");
}
else
{
System.out.println("Not Eligible");
}
}
}
}