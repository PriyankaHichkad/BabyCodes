/**Q- WAP to accept a and print the sum of the series:
a+ a2 + a3 …… +a10
 */
import java.io.*;
public class seriessum_a1_a2_a3 {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,a, s=0;
        System.out.println ("Enter a");
        a=Integer.parseInt(in.readLine());
        for(i=1; i<=10; i++)
        s=s+(int)Math.pow(a,i);
        System.out.println("Sum of series="+s);
    }
}
