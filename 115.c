/*
Write a program which 2 strings from user and concat second string
after first string. (Implement strcat() function).
Input :
“Marvellous Infosystems”
“Logic Building”
Output :
“Marvellous Infosystems Logic Building”
*/
#include<stdio.h>
void StrCat(char *Crr,char *Drr)
{
    while(*Crr!='\0')
    {
        Crr++;
    }
    while(*Drr!='\0')
    {
        *Crr=*Drr;
         Drr++;
         Crr++;
    }

}
int main()
{
    char Arr[100];
    char Brr[100];
    printf("Enter First String\n");
    scanf("%[^'\n']s",Arr);
    printf("Enter Second String\n");
    scanf(" %[^'\n']s",Brr);

    StrCat(Arr,Brr);
    printf("%s\n",Arr);
    


    return 0  ;
}
