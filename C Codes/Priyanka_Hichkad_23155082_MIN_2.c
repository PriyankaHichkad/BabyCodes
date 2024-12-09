#include <stdio.h>
void reverseArr(int a[], int n);
int main()
{
    int n,i;
    printf("enter n\n");
    scanf("%d",&n );
    int a[n];
    printf("enter elements: \n");
    for(i=0; i<n; i++)
    scanf("%d", &a[i]);
    reverseArr(a, n);
    printf("\n Reverse array: \n");
    for(i=0; i<n; i++)
    printf("%d \t", a[i]);
    return 0;
}
void reverseArr(int a[], int n)
{
    int i,j,t;
    for(i=0,j=(n-1); i<(n/2); i++,j--)
    {
        t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}