//Q- WAP to accept a sentence & display longest word of sentence
import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int x=0, m, k=0,p; String a=" ", c=" ", name= " "; char ch;
       System.out.println("Enter the String");
       String n=in.nextLine();
       n=n+" ";
       p=n.length();
       for(m=0; m<p; m++)
       {
           ch=n.charAt(m);
           if(ch==' ')
           {
               x=a.length();
               if(x>k)
               {
                   k=x;
                   c=a;
                }
                a=" ";
            }
            else
            a=a+ch;
        }
        System.out.println("the length of longest word ="+k);
        System.out.println("the longest word="+c);
    }
}
