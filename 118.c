/*
Write a program which accept string from user and copy that
characters of that string into another string by converting all small
characters into capital case.
Input : “Marvellous Python 2”
Output : “MARVELLOUS PYTHON 2”
*/
#include<stdio.h>
void ConvertCase(char *Crr,char *Drr)
{
    if(Crr==NULL)
    {
        return;
    }
    while(*Crr!='\0')
    {
        if((*Crr>='a')&&(*Crr<='z'))
        {
            *Drr= *Crr - 32 ;
            Drr++;
        }
        else
        {
            *Drr=*Crr;
            Drr++;
        }
        Crr++;
    }
}
int main()
{
    char Arr[100]="\0";
    char Brr[100]="\0";
    printf("Enter String\n");
    scanf("%[^'\n']s",Arr);
    ConvertCase(Arr,Brr);
    printf("Modified String is : %s\n",Brr);
    return 0 ;
}