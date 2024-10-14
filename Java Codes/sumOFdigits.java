//Q- WAP to print the sum of digits of the number inputted by the user.
import java.io.*;
public class sumOFdigits {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader (System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the Number");
        int x=Integer.parseInt(in.readLine());
        int sum=0,r;
        while(x!=0)
        {
            r=x%10;
            sum=sum+r;
            x=x/10;
        }
        System.out.println("Sum="+sum);
    }
}
