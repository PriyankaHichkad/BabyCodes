/**Q- WAP to print: A
                             A 2
                             A 2 B
                             A 2 B 4
 */
public class nestedA_A2_A2B_A2B4 {
    public static void main(String[] args) {
        int i,j,a=64;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print(j);
                else
                {
                    a++;
                System.out.print((char)a);
            }
            }
            a=64;
            System.out.println(" ");
        }
    }
}
