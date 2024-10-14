/**Q- WAP to accept a number, check and display if the number is prime.
Prime Number= number whose factors are 1 and the number itself.
 */
import java.io.*;
public class PrimeNum {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n,i,a=0;
        System.out.println ("Enter a number");
        n=Integer.parseInt(in.readLine());
        for(i=1; i<=n; i++)
        {
            if(n%i==0)
            a++;
        }
        if(a==2)
        System.out.println("It is a Prime Number");
        else
        System.out.println("It is not a Prime Number");
    }
}
