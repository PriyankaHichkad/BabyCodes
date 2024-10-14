/**Q-WAP to input a number and find out if it is a Niven number. 
 Niven number= It is a number divisible by the sum of its digits
 E.g.152=1+5+2=8 == 152%8=0
 */
import java.util.*;
public class Niven_Number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,t,r,s=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        t=n;
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        if(t%s==0)
        System.out.println("Niven Number");
        else
        System.out.println("Not a Niven Number");
    }
}
