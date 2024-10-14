/**Q- WAP to input a number and find out if its a Krishna Murthy Number/Special Number
KrishnaMurthy/Special Number: It is a number which is = the sum of the factorial of its digits e.g. 1 ,2,145, 40585, etc
 */
import java.io.*;
public class krishnamurthy_num {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader (System.in);
        BufferedReader in=new BufferedReader(read);
        int i,t,r,f, s=0;
        System.out.println("Enter the Number");
        int n=Integer.parseInt(in.readLine());
        t=n;
        while(n>0)
        {
            f=1;
            r=n%10;
            for(i=1; i<=r; i++)
                f=f*1;
            s=s+f;
            n=n/10;
        }
        if(s==t)
        System.out.println ("Krishna Murthy Number");
        else
        System.out.println("Not a Krishna Murthy Number");
    }
}
