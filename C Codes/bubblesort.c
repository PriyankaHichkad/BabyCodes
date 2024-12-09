#include<stdio.h>
int main()
{
    int a[]={1,5,4,7,3};
    int t,i,j;
    printf("array \n");
    for(i=0; i<5; i++)
    printf("%d \t",a[i]);
    for(i=0; i<5-1; i++)
    {
        for(j=0; j<5-1-i; j++)
        {
            if(a[j]>a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }

    }
    printf("\n sorted array \n");
    for(i=0; i<5; i++)
    printf("%d \t",a[i]);
    return 0;
}