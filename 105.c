/*
Write a program which accept string from user and count number of
white spaces
Input : “MarvellouS”
Output : 0
Input : “MarvellouS Infosystems”
Output : 1
Input : “MarvellouS Infosystems by Piyush Manohar Khairnnar”
Output : 5
*/
#include<stdio.h>
int CountSpace(char *Brr)
{   int sCnt=0;
    while(*Brr!='\0')
    {
        if(*Brr==' ')
        {
            sCnt++;
        }
        Brr++;
    }
    return sCnt;
}
int main()
{
    char Arr[100];
    int iRet = 0;
    printf("Enter String\n");
    scanf("%[^'\n']s",Arr);
    iRet= CountSpace(Arr);
    printf("Number of spaces are : %d\n",iRet);
    return 0 ;
}