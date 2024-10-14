/**Q- WAP to accept a sentence & display total no. of vowels present.
E.g INPUT:Welcome to strings
      OUTPUT: Total no. of vowels = 5
 */
import java.util.*;
public class no_of_vowels {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s; int i, l; char ch; int a=0;
        System.out.println ("Enter a Sentence");
        s=in.nextLine(); s=s.toLowerCase();
        l=s.length();
        for(i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
            a++;
        }
        System.out.println("No. of vowels=" +a);
    }
}
