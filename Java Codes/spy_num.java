/**Q- WAP to input a number and find if it’s a spy number.
Spy number: is a number whose sum of digits = product of digits
Eg: 123 = 1+2+3 =6 & 1*2*3=6
 */
import java.util.*;
public class spy_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n, r, s=0, p=1;
        System.out.println("Enter a Number");
        n=in.nextInt();
        while(n>0)
        {
            r=n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        if(s==p)
        System.out.println("It is a spy number");
        else
        System.out.println("It is not a spy number");
    }
}
