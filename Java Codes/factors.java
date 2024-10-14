//Q- WAP to input a number and find its factors.
import java.io.*;
public class factors {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a Number");
        int n= Integer.parseInt(in.readLine());
        System.out.println("Factors are");
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            System.out.println(i);
        }
    }
}
