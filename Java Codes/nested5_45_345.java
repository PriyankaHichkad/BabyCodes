/**Q- WAP to print:
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
 */
public class nested5_45_345 {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=(5-i);j<=5;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
