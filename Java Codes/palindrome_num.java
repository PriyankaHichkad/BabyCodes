//Q- WAP to input a number and find out if it is a palindrome number.
//A Palindrome number:It is a number which when read backwards is the same as the number inputed. e.g.101, 151, 212
import java.io.*;
public class palindrome_num {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader (System.in);
        BufferedReader in=new BufferedReader(read);
        int r,t,s=0;
        System.out.println("Enter a Number");
        int n=Integer.parseInt(in.readLine());
        t=n;
        while (n>0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==t)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not a Palindrome Number");
    }
}
