//Q- WAP to accept a sentence and perform all the string functions on it.
import java.util.*;
public class StringFunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x="Malayalam"; //static initialization
        System.out.println(x);
        System.out.println("length="+x.length());
        System.out.println("Pl enter a sentence");
        String xx=sc.nextLine();
        System.out.println("Pl enter a word");
        String xxl=sc.next();
        int len= xx.length();
        System.out.println("length="+len);
        System.out.println("length="+xxl.length());
        int c=x.indexOf('a');
        //returns 1st occurence of the argument
        System.out.println(c);
        int y=x.lastIndexOf('a');
        //last occurence of argument
        System.out.println(y);
        int l=x.indexOf("lam");
        System.out.println(l);
        int k=x.lastIndexOf(' ');
        //last char resides at length -1 postion
        System.out.println(k);
        System.out.println(x.substring(3));
        //part of string beginning at 3rd position till end of string
        String n=x.substring(5); //dynamic inititalization
        System.out.println(n);
        System.out.println(x.substring(3,7));
        //returns from 3rd position tSystem.out.printlno 7th excluding 7th char
        String p=x.replace('a','b');
        System.out.println(p);
        System.out.println(x);
        System.out.println(x.concat(p));
        System.out.println(x+p);
        System.out.println(x.equals(p));
        //checks 1st string is same as 2nd string
        //returns boolean value
        String m="Malayalam";
        System.out.println(x.equals(m));
        System.out.println(x.equalsIgnoreCase(m));
        System.out.println(x.compareTo(m));
        System.out.println("Banana".compareTo("Apple"));
        //returns integer value
        //Ascii value of B-Ascii value of A
        //-ve value as 2nd string larger then 1st
        System.out.println("Mango".compareTo("Apple"));
        //+ve value
        System.out.println("apple".compareTo("apple"));
        //zero
        System.out.println("Apple".compareTo("apple"));
        //case-sensitive, so -ve value
        System.out.println("banana".compareTo("apple"));
        System.out.println("Shubha".compareTo("Shubham"));
        System.out.println("Apples".compareTo("Apples"));
        //diff of length = -ve if 1st is small
        System.out.println("it".compareTo("its"));
        System.out.println("Item".compareTo("It"));
        String q="    Wel  come  ";
        System.out.println(q.trim());
        //removes leading and ending spaces
    }
}
