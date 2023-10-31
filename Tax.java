import java.util.Scanner;

public class Tax {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();
        System.out.println("Eneter the Elements of array :");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>1000)
            {

                s=s+(a[i]-1000)/10;
            }
            
            
        }
        System.out.println("Ans is :"+s);
    }
}