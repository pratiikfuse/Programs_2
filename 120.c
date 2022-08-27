/*
Write a program which accept string from user and copy that
characters of that string into another string by toggling the case.
Input : “Marvellous Python 2”
Output : “mARVELLOUS pYTHON 2”
*/
#include<stdio.h>
void ToggleCase(char *Crr,char *Drr)
{
    while(*Crr!='\0')
    {
        if((*Crr>='A')&&(*Crr<='Z'))
        {
            *Drr = *Crr + 32;
        }
        else if((*Crr>='a')&&(*Crr<='z'))
        {
          *Drr = *Crr - 32 ;
        }
        else
        {
            *Drr = *Crr;
        }
        Crr++;
        Drr++;

    }

}
int main()
{
    char Arr[100]="\0";
    char Brr[100]="\0";
    printf("Enter String\n");
    scanf("%[^'\n']s",Arr);

    ToggleCase(Arr,Brr);
    printf("Modified String is : %s\n",Brr);

    return 0 ;
}