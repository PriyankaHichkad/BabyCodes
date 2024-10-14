//Q- WAP to accept a number and reduce its value as per users choice.
import java.io.*;
public class DoYouWishToContinue {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader (System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the Number");
        int n=Integer.parseInt(in.readLine());
        //String x =""; 
        char ch1;
        do
        {
            System.out.println(n);
            n--;
            System.out.println("Do you wish to continue?");
            ch1=in.readLine().charAt(0);
        }
        while(ch1=='y' || ch1=='Y');
        System.out.println("Bye");

    }
}
