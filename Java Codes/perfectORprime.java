//Q-WAP to accept a number and check and display if the number is a perfect number or a prime number based on user’s choice.
import java.io.*;
public class perfectORprime {
    public static void main(String[] args) throws IOException{
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n,a,i,s=0;
        System.out.println ("1.Perfect No \n" + "2.Prime No.");
        a=Integer.parseInt(in.readLine());
        System.out.println("Enter a Number");
        n=Integer.parseInt(in.readLine());
        switch(a)
        {
            case 1:
            for(i=1; i<n; i++)
            {
                if (n%i==0)
                s=s+i;
            }
            if(s==n)
            System.out.println("It is a Perfect Number");
            else
            System.out.println("It is not a Perfect Number");
            break;
            case 2:
            for(i=1; i<=n; i++)
            {
                if(n%i==0)
                s++;
            }
            if(s==2)
            System.out.println("It is a Prime Number");
            else
            System.out.println("It is not a Prime Number");
            break;
            default:
            System.out.println("Invalid input");
        }
    }
}
