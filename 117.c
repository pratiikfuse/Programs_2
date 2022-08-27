/*
Write a program which accept string from user and copy that
characters of that string into another string by removing all white
spaces.

Input : “Marvel lous Pyth on”
Output : “MarvellousPython”
*/
#include<stdio.h>
void StrCpyx(char *Crr,char *Drr)
{
    int i = 0;
    int j = 0;
    while(Crr[i]!='\0')
    {
        if(Crr[i]!=' ')
        {
        Drr[j]=Crr[i];
         j++;
        }
       i++;
    }
}
    
int main()
{
    char Arr[100];
    char Brr[100]="\0";
    printf("Enter String\n");
    scanf("%[^'\n']s",Arr);

    StrCpyx(Arr,Brr);
    printf("%s\n",Brr);

    return 0 ; 
}