import java.io.*;
import java.util.*;
public class Siz
{
public static void main(String[] args)
{
int[] arr={1,2,3,4,5,9,25,7,36,10};
int count=0;
for(int i=0;i<arr.length;i++)
{
for(int col=0;col<arr.length;col++)
{
if(col*col==arr[i])
{
count++;
}
}
}
System.out.println(count);
}
}
