//Q- WAP to accept a number, check and display if the number is positive or a negative number.
import java.util.*;
public class PosNeg {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a Number");
        int a=in.nextInt();
        if(a>0)
        {
            System.out.println("Number is positive");
        }
        if(a<0)
        {
            System.out.println("Number is negative");
        }
        if(a==0)
        {
            System.out.println("Number is zero");
        }
    }
}
