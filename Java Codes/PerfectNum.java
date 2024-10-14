/**Q- WAP to accept a number, check and display if it’s a Perfect number or not.
Perfect number- sum of factors (excluding original) = original number.
Eg: 6=1+2+3
 */
import java.io.*;
public class PerfectNum {
    public static void main(String[] args) throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n,i,s=0;
        System.out.println("Enter a Number");
        n=Integer.parseInt(in.readLine());
        for(i=1; i<n; i++)
        {
            if(n%i==0)
            s=s+i;
        }
        if(s==n)
            System.out.println("It is a Perfect Number");
        else
            System.out.println("It is not a Perfect Number");

    }
}
