//Q- WAP to accept a number and display its digits vertically.
import java.util.*;
public class display_digits_vertically {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,n,k=0,t,a,b,c;
        System.out.println("Enter a Number");
        n=in.nextInt();
        t=n;
        b=n;
        while(n>0)
        {
            n=n/10;
            k=k+1;
            //System.out.println(k);
        }
        c=k;
        for(i=1;i<=c;i++)
        {
            a=(int)(t/Math.pow(10,(k-1)));
            System.out.println(a);
            t=(int)(t%Math.pow(10,(k-1)));
            k=k-1;
         }
    }
}
