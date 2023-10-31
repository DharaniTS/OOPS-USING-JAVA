import java.io.*;
import java.util.Arrays;
public class Upper 
{    
    public static void main(String[] args) 
	{    
    int rows, cols;     
        int a[][] = {       
                        {1, 2, 3},    
                        {8, 6, 4},    
                        {4, 5, 6}    
                    };    
             
          
              System.out.println("Upper triangular matrix: ");    
              for(int i = 0; i < a.length; i++){    
                  for(int j = 0; j <a.length; j++)
				  {    
                    if(j < i)    
                      System.out.print("0 ");    
                    else    
                      System.out.print(a[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }