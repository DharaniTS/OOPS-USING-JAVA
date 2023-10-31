import java.io.*;
import java.util.*;
public class Transposematrix
{
public static void main(String[] args)
{
	int i,j;
Scanner s=new Scanner (System.in);
System.out.print("enter elements");
int[][] arr=new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
arr[i][j]=s.nextInt();
}
}
System.out.println("elements are");
int[][] transpose=new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
transpose[i][j]=arr[j][i];
System.out.print(transpose[i][j] + " " );
}
System.out.println();
}
}
}
