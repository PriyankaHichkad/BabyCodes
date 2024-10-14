/**Q- WAP to print all perfect numbers from 1 to 100.
Perfect number- sum of factors (excluding original) = original number.
Eg: 6=1+2+3
 */
public class PerfectNum_2_100 {
    public static void main(String[] args) {
        int i,j,s=0;
        for(j=2 ; j<=100 ; j++)
        {
           for(i=1; i<j; i++)
           {
             if(j%i==0)
             s=s+i;
           } 
           if(s==j)
            System.out.println(j);
           s=0;
        }
    }
}
