import java.io.*;
import java.util.Arrays;
public class Adjoint
{    
    public static void main(String[] args) 
	{    
    int rows, cols;     
        int a[][] = {{1, 2},{8, 6}};
		int c,d,e;
		c=a[0][1]*a[1][0];
		d=a[1][1]*a[0][0];
		System.out.println(c);
		System.out.println(d);
		e=c-d;
		System.out.println(e);
		
	}
	}