//Q- WAP to accept two number and execute algebraic operations on them as the user’s choice. Use Scanner class to input the choice.
import java.util.*;
public class UsingScanANDswitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(" c.Add \n b.Subtract \n c.Multiply \n d.Divide \n e. Remainder\n Please enter your choice");
        char ch=in.next().charAt(0);
        System.out.println("Please enter the numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        switch(ch)
        {
        case 'a': case 'A':
        System.out.println("Sum - "+(a+b));
        break;
        case 'b': case 'B':
        System.out.println("Difference - "+(a-b));
        break;
        case 'c' : case 'C':
        System.out.println("Product - "+(a*b));
        break;
        case 'd' : case 'D':
        System.out.println("Quotient - "+(a/b));
        break;
        case 'e' : case 'E':
        System.out.println("Remainder - "+(a%b));
        break;
        default:
        System.out.println("Invalid Input");
    }
    }
}
