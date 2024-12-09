#include<stdio.h>
int main()
{
    int i=5;
    int *ptr=&i;
    printf("pointer: %d \n", (*ptr));
    printf("Address: %p\n",(&ptr));
    return 0;
}