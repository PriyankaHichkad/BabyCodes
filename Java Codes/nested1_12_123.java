/**Q- WAP to print:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class nested1_12_123 {
    public static void main(String[] args) {
      int k=0,i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
                 System.out.print(++k+" ");
            System.out.println();
        }
    }
}
