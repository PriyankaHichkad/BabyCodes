//Q- WAP to accept two number and execute algebraic operations on them as the user’s choice.
import java.io.*;
public class eg_switchcase {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Remainder");
        System.out.println("Enter your choice");
        int ch=Integer.parseInt(in.readLine());
        int a,b;
        System.out.println("Enter 2 numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        switch(ch)
        {
            case 1:
            System.out.println("Sum="+(a+b));
            break;
            case 2:
            System.out.println("Difference="+(a-b));
            break;
            case 3:
            System.out.println("Product="+(a*b));
            break;
            case 4:
            System.out.println("Quotient="+(a/b));
            break;
            case 5:
            System.out.println("Remainder="+(a%b));
            break;
            default:
            System.out.println("Invalid Input");
        }     
    }
}
