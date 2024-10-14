//Q- WAP to accept 3 sides of a triangle, check and display if the triangle is isosceles, scalene or equilateral.
import java.io.*;
public class TriangleType {
    public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int a,b,c;
        System.out.println("Enter the 3 sides");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());
        if (a==b && b==c && a==c)
        System.out.println("Triangle is equilateral");
        else if(a!=b && b!=c && a!=c)
        System.out.println("Triangle is Scalene");
        else
        System.out.println("Triangle is isoscles");
    }
}
