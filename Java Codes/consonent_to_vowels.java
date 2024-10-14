/**Q- WAP to accept a sentence, convert to Upper case, create a new sentence by replacing each consonant with the previous character and if the previous character is a vowel then the character does not shift to previous character (use different methods)
Eg.  COMP APP ----- BOLP APP
 */
import java.util.*;
public class consonent_to_vowels {
    Scanner in=new Scanner(System.in);
    String s, str="";
    void accept()
    {
        System.out.println("Enter the sentence");
        s=in.nextLine();
        s.toUpperCase();
    }
    void rearrange()
    {
        int i, l=s.length(), c; char a, b;
        for(i=0; i<l; i++)
        {
            a=s.charAt(i);
            if(a==' ')
            {
                str=str+a;
                continue;
            }
            if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
            str=str+a;
            else
            {
                c=a-1;
                b=(char)c;
                if(b=='A'||b=='E'||b=='I'||b=='O'||b=='U')
                str=str+a;
                else
                str=str+b;
            }
        }
    }
    void display()
    {
        System.out.println("Rearranged Sentence:"+str);
    }

    public static void main(String[] args) {
        consonent_to_vowels ob=new consonent_to_vowels();
        ob.accept();
        ob.rearrange();
        ob.display();
    }
}
