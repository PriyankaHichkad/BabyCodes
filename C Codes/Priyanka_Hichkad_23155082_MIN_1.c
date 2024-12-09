#include <stdio.h>
void printStepArray(int a[], int n, int no);
int main()
{
    int n,i,no;
    printf("Enter n\n");
    scanf("%d",&n );
    int a[n];
    printf("Enter Elements: \n");
    for(i=0; i<n; i++)
        scanf("%d", &a[i]);
    printf("Enter numberof steps: \n");
    scanf("%d" , &no);
    printStepArray(a,n,no);
    printf("New Array: \n");
    for(i=0; i<n; i++)
    printf("%d \t", a[i]);
}
void printStepArray(int a[], int n, int no)
{
    int b[n],i;
    for(i=0; i<n; i++)
        b[i]=a[i];
    for(i=0; i<n; i++)
    {
        if(i<no)
            a[i]=b[n-(no-i)];
        else
            a[i]=b[i-no];
    }
}
