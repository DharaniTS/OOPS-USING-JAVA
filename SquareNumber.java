import java.util.*;
public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
       sc.close();
        String a=Integer.toString(n);
       int x=a.length();
       // System.out.println(x);
       int d=1,i;
       for(i=0;i<x;i++)
       {
        d*=10;
       }
      int sqr=n*n;
       if((sqr%d)==n)
       System.out.println("yes");
       else
       System.out.println("no");



    }
}