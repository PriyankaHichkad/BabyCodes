#include <stdio.h>
int main()
{
    int a[]={1,2,3,4,5,6};
    int i,j,t;
    printf("original array: \n");
    for(i=0; i<6; i++)
    printf("%d \t", a[i]);
    for(i=0,j=5; i<3; i++,j--)
    {
        t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    printf("\n reverse array: \n");
    for(i=0; i<6; i++)
    printf("%d \t", a[i]);
    return 0;
}