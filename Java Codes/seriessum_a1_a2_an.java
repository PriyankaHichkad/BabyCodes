/**Q- WAP to accept a and n and find the sum of the series:
             a + a2 + a3 + …… + an
 */
import java.io.*;
public class seriessum_a1_a2_an {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a,n,i,s=0;
        System.out.println ("Enter a and n");
        a=Integer.parseInt(in.readLine());
        n=Integer.parseInt(in.readLine());
        for(i=1; i<=n; i++);
        s=s+(a/i);
        System.out.println("Sum of series="+s);
    }
}
