/**Q- WAP  to print:
1
3 5
5 7 9
7 9 11 13
9 11 13 15
 */
public class nested1_35_579{
    public static void main(String[] args) {
        int i,j,p,q=1;
        for(i=1;i<=5;i++)
        {
            p=q;
            for(j=1;j<=i;j++)
            {
                System.out.print(p);
                p+=2;
            }
            q+=2;
            System.out.println();
        }
    }
}
