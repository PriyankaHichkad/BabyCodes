/**Q- WAP to input a number and check and print whether it is munchausen number or not.
Munchausen number = sum of its digits raised to the power of itself.
E.g: 3435 = 33 + 44 + 33 + 55 = 27 + 256 + 27 + 3125 = 3435
 */
import java.util.*;
public class munchausen_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,t,s=0,r=0,p=0;
        System.out.println("Enter a Number");
        n=in.nextInt();
        t=n;
        while(n>0)
        {
            r=n%10;
            p=(int)Math.pow(r,r);
            s=s+p;
            n=n/10;
        }
        if(t==s)
           System.out.println("It is a Munchausen Number");
        else
           System.out.println("It is not a Munchausen Number");
    }
}
