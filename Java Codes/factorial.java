//Q- WAP to accept a number and print its factorial
import java.io.*;
public class factorial {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader (System.in);
        BufferedReader in=new BufferedReader(read);
        int i,f=1;
        System.out.println("Enter the Number");
        int n=Integer.parseInt(in.readLine());
        for(i=1 ; i<=n ; i++)
            f=f*i;
        System.out.println("Factorial of the Number="+f);
    }
}
