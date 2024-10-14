/**Q- WAP to input a number and find out if its an Armstrong Number
Armstrong Number:It is a number whose sum of digit's cube = the number
E.g.153 = 1+125+27
 */
import java.io.*;
public class armstrong_num {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader (System.in);
        BufferedReader in=new BufferedReader(read);
        int n,r,t,s=0;
        System.out.println("Enter the Number");
        n=Integer.parseInt(in.readLine());
        t=n;
        while(n>0)
        {
            r=n%10;
            s=s=(int) Math.pow(r,3);
            n=n/10;
        }
        if(s==t)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not a Armstrong Number");
    }
}
