/*
Write a program which accept string from user and accept one
character. Check whether that character is present in string or not.
Input :“Marvellous Multi OS”
        e
Output : TRUE
Input : “Marvellous Multi OS”
        W
Output : FALSE
*/
#include<stdio.h>
#include<stdbool.h>
bool ChckChar(char*Brr,char cValue)
{
   bool bPresent = false ;
   while(*Brr!='\0')
   { 
        if(*Brr==cValue)
        {
           bPresent=true;
           break;
        }
        Brr++;
   }
   return bPresent;
}
int main()
{
    char Arr[100];
    char ch  = '\0';
    bool bRet=false;
    printf("Enter String\n");
    scanf("%[^'\n']s",Arr);
    printf("Enter character\n");
    scanf(" %c",&ch); 
    bRet=ChckChar(Arr,ch);
    if(bRet==true)
    {
        printf("it is present\n");
    }
    else
    {
      printf("it is not present\n");
    }

    return 0 ;
}