/**Q- WAP to input a number and find out if it is a palindrome word.
A Palindrome word:It is a word which is spelled the same when read backwards 
E.g. MOM, DAD, NITIN, MALAYALAM
 */
import java.util.*;
public class palindrome_word {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s; int i; char b; String str=" ",str1=" ";
        System.out.println("Enter a String");
        s=in.nextLine();
        for(i=0; i<s.length(); i++)
        {
            b=s.charAt(i);
            str=b+str;
        }
        if(str.equals(s))
        System.out.println("Palindrome Word");
        else
        System.out.println("Not a Palindrome Word");
    }
}
