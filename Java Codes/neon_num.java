/**Q- Neon number=It is a number whose sum of digits of the square of the number is equal to the number.
 E.g. 9 = 92  = 81= 8+1 = 9
 */
import java.util.*;
public class neon_num {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n,sq,s=0,r;
        System.out.println("Enter a number");
        n=in.nextInt();
        sq=(int)Math.pow(n,2);
        while (sq>0)
        {
            r=sq%10;
            s=s+r;
            sq=sq/10;
        }
        if(s==n)
        System.out.println("Neon Number");
        else
        System.out.println("Not a Neon Number");
    }
}
