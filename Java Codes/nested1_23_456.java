/**Q- WAP to print : 1
                               2 3
                               4 5 6
                               7 8 9 10
 */
public class nested1_23_456 {
    public static void main(String[] args) {
        int i,j,a=1;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a+=1;
            }
            System.out.println();
        }
    }
}
