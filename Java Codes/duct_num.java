/**Q- Duct Number=It is a number which has zero present in it except in the beginning
 E.g.101, 50, 202
 */
import java.util.*;
public class duct_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,r,k=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r==0)
            {
                k=1;
                break;
            }
            n=n/10;
        }
        if(k==1)
        System.out.println("Duct Number");
        else
        System.out.println("Not a Duct Number");
    }
}
