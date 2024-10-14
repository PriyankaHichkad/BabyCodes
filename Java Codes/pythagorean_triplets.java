//Q- WAP to print the pythagrean triplets between 1 to 100.
public class pythagorean_triplets {
    public static void main(String[] args) {
        int i,j,a,c,b;
        for(i=1;i<=100;i++)
        {
            for(j=1;j<i;j++)
            {
                a=(i*i)-(j*j);
                b=2*i*j;
                c=i*i+j*j;
                if(c>100)
                break;
                System.out.println(a+" "+b+" "+c);
            }
            //System.out.println();
        }
    }
}
