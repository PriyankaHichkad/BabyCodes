#include <stdio.h>
int main()
{
    int i;
    int n[]={10,12,5,4,77};
    int max=n[0];
    int min=n[0];
    for(i=0; i<5; i++)
    {
        if(n[i]>max)
        max=n[i];
        if(n[i]<min)
        min=n[i];
    }
    printf("max= %d",max);
    printf("min= %d",min);
    return 0;
}