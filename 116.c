/*
Write a program which accept string from user and copy that
characters of that string into another string in reverse order.
Input : “Marvellous Python”
Output : “nohtyP suollevraM”
*/
#include<stdio.h>
void ReverseCopy(char *Crr,char *Drr)
{
    int i = 0;
    int j = 0;
    while(*Crr!='\0')
    {
        Crr++;
        i++;
    
    }
    Crr--;
    while(i>=0)
    {
       *Drr = *Crr; 
       Drr++;
       Crr--;
       i--;
    }
}
int main()
{
    char Arr[100]="\0";
    char Brr[100]="\0";
    printf("Enter String\n");
    scanf("%[^'\n']s",Arr);

    ReverseCopy(Arr,Brr);
    printf("Reverse String is : %s\n",Brr);
    return 0 ;
}
