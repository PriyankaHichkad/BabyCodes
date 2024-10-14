/**Q- WAP to accept 2 numbers from user, check and display if they are twin prime.
Twin prime= prime numbers who have difference equal to 2 between them.
 */
import java.util.*;
public class TwinPrime {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a,b,i,m=0,n=0,diff;
        System.out.println ("Enter two Numbers");
        a=in.nextInt();
        b=in.nextInt();
        for(i=1; i<=a; i++)
        {
            if(a%i==0)
            m++;
        }
        diff=Math.abs(a-b);
        for(i=1;i<=b;i++)
        {
            if(b%i==0)
            n++;
        }
        if(n==2 && m==2 && diff==2)
        System.out.println("They are Twin-Prime");
        else
        System.out.println("They are not Twin-Prime");
    }
}
