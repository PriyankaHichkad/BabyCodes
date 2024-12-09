#include <stdio.h>
int main()
{
    int n,i;
    printf("enter n\n");
    scanf("%d",&n );
    int a[n];
    printf("enter elements: \n");
    for(i=0; i<n; i++)
    scanf("%d", &a[i]);
    printf("\n even elements:\n");
    for(i=0; i<n ;i++)
    {
        if(a[i]%2==0)
        printf("%d \t",a[i]);
    }
    return 0;
}