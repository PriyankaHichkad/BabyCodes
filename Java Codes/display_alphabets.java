//Q- WAP to accept a string and display alphabets on separates lines.
import java.util.*;
public class display_alphabets {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String k=in.next();
        int s=0;
        int m= k.length();
        for(int i=0; i<m; i++)
        {
            char ch=k.charAt(i);
          System.out.println(ch);
        }
    }
}
