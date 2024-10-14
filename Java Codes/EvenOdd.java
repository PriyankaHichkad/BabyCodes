//Q- WAP to check whether the inputted number is even or not.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter the Number");
        int a=Integer.parseInt(in.readLine());
        if (a%2==0)
        {
            System.out.println("Numberis even");
        }
        else
        {
            {
                System.out.println("Number is odd");
            }
        }
    }

}
