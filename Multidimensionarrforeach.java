import java.io.*;
public class Multidimensionarrforeach
{
public static void main(String[] args)
{
int[][]a={{1,-2,3},{-4,-5,6,7},{9}};
for(int[] i:a)
{
for(int j:i)
{
System.out.println(j);
}
}
}}