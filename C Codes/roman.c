#include <stdio.h>
#include <string.h>
int main()
{
    char s[]="renqo daj wppwyg";
    int i,j;
    for(i=1; i<26; i++)
    {
        for(j=0; j<16; j++)
        {
            printf(s[j]);
        }
    }
}