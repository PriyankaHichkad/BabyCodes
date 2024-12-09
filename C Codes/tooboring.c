# include <stdio.h>
#include <math.h>
int main()
{
    int n,r,s=0,i=5;
    printf("enter 5 digit num");
    scanf("%d",&n);
    while(n>0)
    {
        r=n%10;
        s=s*(int)(pow(10,i)) +r;
        n/=10;
        i--;
    }
    printf("sum %d",s);
    return 0;
}