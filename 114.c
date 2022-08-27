/*
Write a program which accept string from user and copy small
characters of that string into another string.
Input : “Marvellous multi OS”
Output : “arvellous multi”
*/
#include<stdio.h>
void StringSmall(char *Crr,char *Drr)
{
	 if(Crr==NULL)
	{
		return;
	}
     while(*Crr!='\0')
     {
     	if((*Crr>='a')&&(*Crr<='z')||(*Crr==' '))
     	{
     		*Drr = *Crr;
           	Drr++;
        }
     	Crr++;
     }
}
int main()
{
	char Arr[100];
	char Brr[100];
	printf("Enter String\n");
	scanf("%[^'\n']s",Arr);

	StringSmall(Arr,Brr);
	printf("String With only Small case is : %s\n",Brr);

	return 0 ;

}