/**Q- WAP to input a number. Check and print whether it’s a kaprekar number or not.
Kaprekar number = its square when divided into 2 parts and such that the sum of the parts is equal to the original number and none part has value 0.
Eg:  45 :  45 * 45 = 2025,    20 + 25 = 45
 */
import java.util.*;
public class kaprekar_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,t,sq,r=0,k=0,lp,p,rp,s;
        System.out.println("Enter a Number");
        n=in.nextInt();
        sq=(int)Math.pow(n,2);
        t=sq;
        while(t>0)
        {
            r=t%10;
            k++;
            t=t/10;
        }
        p=k/2;
        lp=sq/(int)(Math.pow(10,p));
        rp=sq%(int)(Math.pow(10,p));
        s=lp+rp;
        if(s==n)
           System.out.println("It is a Kaprekar Number");
        else
           System.out.println("It is not a Kaprekar Number");
    }
}
