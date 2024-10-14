//Q- WAP to  calculate area of a circle, square, or a rectangle as per the users choice.
import java.util.*;
public class switchArea {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch; double c_area, s_area, r_area,r,l,b,s;
        System.out.println("Enter A.Circle, B.Square, C.Rectangle");
        ch=in.next().charAt(0);
        switch (ch)
        {
            case'A': case'a':
            System.out.println("Enter the Radius");
            r=in.nextDouble();
            c_area=3.14*r*r;
            System.out.println("Area of the Circle is "+c_area);
            break;
            case'B': case'b':
            System.out.println("Enter the Side");
            s=in.nextDouble();
            s_area=s*s;
            System.out.println("Area of the Square is "+s_area);
            break;
            case 'C': case'c':
            System.out.println("Enter the Length");
            l=in.nextDouble();
            System.out.println("Enter the Breadth");
            b=in.nextDouble();
            r_area=l*b;
            System.out.println("Area of the Rectangle is "+r_area);
            break;
            default:
            System.out.println("Invaild Input");
        }
    }
}
