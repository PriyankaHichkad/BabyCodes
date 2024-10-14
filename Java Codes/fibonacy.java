/**Q- WAP to enter the value of n to print the fibonacy series:
0, 1, 1, 2, 3, 5, 8, 13 …….. n
 */
import java.util.*;
public class fibonacy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,n,n1=0,n2=1,s=0;
        System.out.println("Enter n");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.print(n1+" ");
            s=n1+n2;
            n1=n2;
            n2=s;
        }
    }
}
