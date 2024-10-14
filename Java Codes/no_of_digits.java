//Q- WAP to accept a number and write its number of digits
import java.util.*;
public class no_of_digits
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,a=0,b=0,e=0;
        System.out.println("Enter a Number");
        n=in.nextInt();
        int t=n;
        while(n>0)
        {
            int r=n%10;
            a++;
            b=b+r;
            System.out.println(r);
            n=n/10;
        }
        System.out.println("Number of Digits"+a);
        System.out.println("Sum= "+b);
        for(int i=a;i>=1;i--)
        {
            int c=t%10;
            int d=(int)Math.pow(c,i);
            e=e+d;
            t=t/10;
        }
        System.out.println("Result= "+e);
    }
}