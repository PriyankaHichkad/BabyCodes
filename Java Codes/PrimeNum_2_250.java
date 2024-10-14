//Q- WAP to find prime numbers from 2 to 250
public class PrimeNum_2_250 {
    public static void main(String[] args) {
        int j,i, a;
        for(j=2 ; j<=250 ; j++)
        {
            a=0;
            for(i=1; i<=j; i++)
            {
                if(j%i==0)
                    a++;
            }
            if(a==2)
            System.out.println(j);
        }
    }
}
