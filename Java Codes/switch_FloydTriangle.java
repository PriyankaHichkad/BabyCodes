/**Q- Using the switch statement, write a menu driven program for the following:
(i) To print the Floyd’s triangle [Given below]
1
2   3
4   5   6
7   8   9  10
11 12 13 14 15
(b) To display the following pattern:
I
I C
I C S
I C S E
For an incorrect option, an appropriate error message should be displayed.
 */
import java.util.*;
public class switch_FloydTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,i,j,c;
        System.out.println("Enter 1 or 2");
        n=in.nextInt();
        switch(n)
        {
            case 1:
            for(i=1; i<=5; i++ )
            {
                for(j=1,c=1; c<=i; c++,j++)
                    System.out.print(j);
                System.out.println();
            }
            break;
            case 2:
            String s="ICSE";
            for(i=0; i<4; i++)
            {
                for(j=0; j<=i; j++)
                System.out.print(s.charAt(j));
                System.out.println();
            }
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
}
