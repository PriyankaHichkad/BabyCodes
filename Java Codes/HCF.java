//Q- WAP to accept 2 integers from the user, calculate and display the HCF/ GCD of the two numbers.
import java.io.*;
public class HCF {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int h=0,a,b, p, i;
        double lcm;
        System.out.println("Enter 2 Numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        p=Math.min(a,b);
        for(i=1; i<=p; i++)
        {
            if(a%i==0 && b%i==0)
            h=i;
        }
        System.out.println("HCF="+h);
        lcm=a*b/h;
        System.out.println("LCM="+lcm);
    }
}
