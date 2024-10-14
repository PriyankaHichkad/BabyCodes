/**Q- WAP to accept a string & display it in the reverse order
E.g. Enter the string = Java is fun
       Reversed String = fun is Java
 */
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Pl Enter the sentence");
        String k=in.nextLine();
        k=k+" ";
        String rev=" ",t=" "; char ch;
        for(int i=0; i<k.length(); i++)
        {
            ch=k.charAt(i);
            if(ch!=' ')
            t=t+ch;
            else
            {
                rev=t+" " +rev;
                t=" ";
            }
        }
        System.out.println("Reverse String="+rev);
    }
}
