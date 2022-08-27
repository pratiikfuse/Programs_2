/*
Write a program which accept string from user and accept one
character. Return index of last occurrence of that character.
Input :
“Marvellous Multi OS”
M
Output : 11
Input : “Marvellous Multi OS”
W
Output : -1
Input : “Marvellous Multi OS”
e
Output :
4
*/
#include<stdio.h>
#include<stdbool.h>
int IndexChar(char*Brr,char cValue)
{
    int i = 0;
    int index = -1;
    while(*Brr!='\0')
    {
        if(*Brr==cValue)
        {
            index = i ;
        }
        i++;
        Brr++;
    }
    if(index==-1)
    {
      return -1;
    }
    return index;
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
    iRet = IndexChar(Arr,ch);
    printf("Index is : %d\n",iRet);
    return 0 ;
}