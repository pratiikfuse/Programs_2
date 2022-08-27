/*
Write a program which accept string from user and copy the
contents of that string into another string. (Implement strcpy()
function)
Input : “Marvellous Multi OS”
Output : “Marvellous Multi OS” in another string
*/
#include<stdio.h>
void CopyString(char *Crr,char *Drr)
{
    if(Crr==NULL)
    {
        return ;
        
    }
    int i = 0;
    for(i=0;Crr[i]!='\0';i++)
    {
        Drr[i] = Crr[i];
    }
}
int main()
{   char Arr[100];
    char Brr[100];
    printf("Enter String\n");
    scanf("%[^'\n']s",Arr);
    CopyString(Arr,Brr);
    printf("String is : %s\n",Brr);
    
    return 0 ;
}