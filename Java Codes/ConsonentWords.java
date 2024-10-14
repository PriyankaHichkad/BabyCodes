/**Q- WAP to accept a sentence and display the frequency of words that start with a consonant irrespective of the case
EXAMPLE:
INPUT – Use your heart while you handle other and use your head while you handle yourself
OUTPUT – No. of consonant words are: 11
 */
import java.util.*;
public class ConsonentWords {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s; char a,b;
        int i,l,c=0;
        System.out.println("Enter a sentence");
        s=in.nextLine();
        s=s.trim(); s=s.toUpperCase();
        s=' '+s;
        l=s.length();
        for(i=0; i<l; i++)
        {
            a=s.charAt(i);
            if(a==' ')
            {
                b=s.charAt(i+1);
                if(b=='A'||b=='E'||b=='I'||b=='O'||b=='U')
                continue;
                else
                c++;
            }
        }
        System.out.println("Number of consonent words are" +c);
    }
}
