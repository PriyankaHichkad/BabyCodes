//Q- WAP to calculate and display sum of the factors of the number inputted by the user.
import java.io.*;
public class FactorSum {
    public static void main(String[] args)throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a Number");
        int n=Integer.parseInt(in.readLine()); int s=0;
        for(int i=1; i<=n; i++)
        {
            if (n%i==0)
            s=s+i;
        }
        System.out.println("Sum="+s);
    }
}
