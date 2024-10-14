//Q- WAP to accept 10 numbers and display the largest number among them.
import java.io.*;
public class LargestNum {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,n,max;
        System.out.println ("Enter 10 numbers");
        max=Integer.parseInt(in.readLine());
        for(i=1; i<10; i++)
        {
            n=Integer.parseInt(in.readLine());
            if(n>max)
            max=n;
        }
        System.out.println("Largest Number="+max);
    }
}
