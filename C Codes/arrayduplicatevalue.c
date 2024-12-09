#include <stdio.h>
int main()
{
    int n,i,j;
    printf("enter n\n");
    scanf("%d",&n );
    int a[n];
    printf("enter elements: \n");
    for(i=0; i<n; i++)
    scanf("%d", &a[i]);
    printf("\n duplicate values:\n");
    for(i=0; i<n ;i++)
    {
        for(j=0; j<n ; j++)
        {
            if(a[i]==a[j] && i!=j)
            printf("%d \t", a[i]);
        }
    }
    return 0;
}