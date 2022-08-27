/*
Write a program which accept string from user and accept one
character. Return frequency of that character.
Input :
“Marvellous Multi OS”
M
Output : 2
Input : “Marvellous Multi OS”
W
output : 0
*/
#include<stdio.h>
int FreqChar(char*Brr,char cValue)
{
   int iCnt = 0 ;
   while(*Brr!='\0')
   { 
        if(*Brr==cValue)
        {
           iCnt++;
        }
        Brr++;
   }
   return iCnt;
}
int main()
{
    char Arr[100];
    char ch  = '\0';
    int iRet = 0;
    printf("Enter String\n");
    scanf("%[^'\n']s",Arr);
    printf("Enter character\n");
    scanf(" %c",&ch); 
    iRet=FreqChar(Arr,ch);
    printf("Frequency is : %d\n",iRet);
   
    return 0 ;
}