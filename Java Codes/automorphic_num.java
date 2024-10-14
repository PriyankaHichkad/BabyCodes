/**Q- WAP to input a number and find out if it is an automorphic number
 Automorphic Number: It is a number which is present in the square of that number
 E.g.5sq=25, 6sq=36, 25sq=625
 */
import java.util.*;
public class automorphic_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,r,t,sq,k=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        t=n;
        sq=(int)Math.pow(n,2);
        while(n>0)
        {
            n=n/10;
            k++;
        }
        r=sq%(int)Math.pow(10,k);
        if(r==t)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
}
