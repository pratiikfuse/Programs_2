/*
Write a program which accept string from user and copy capital
characters of that string into another string.
Input : “Marvellous Multi OS”
Output : “MMOS”
*/
#include<stdio.h>
void StrCopyx(char *Crr,char *Drr)
{
    while(*Crr!='\0')
    {
        if((*Crr>='A')&&(*Crr<='Z'))
        {
            *Drr = *Crr ;
             Drr++;
        }
        Crr++;
    }
}
int main()
{
    char Arr[100];
    char Brr[100];
    printf("Enter String\n");
    scanf("%[^'\n']s",Arr);

    StrCopyx(Arr,Brr);
    printf("%s\n",Brr);
    return 0 ;
}
