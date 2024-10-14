/**Q- WAP to print:
A
A B
A B C
A B C D
A B C D E
 */
public class nestedA_AB_ABC {
    public static void main(String[] args) {
        int i,j;
        for(i=65;i<=69;i++)
        {
            for(j=65;j<=i;j++)
            {
                System.out.print((char)j);
            }
            System.out.println(" ");
        }
    }
}
