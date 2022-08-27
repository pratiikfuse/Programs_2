/*
Write a program which accept string from user reverse that string
in place.
Input : “abcd”
Output : “dcba”
Input : “abba”
Output : “abba”
*/
#include<stdio.h>
void StringReverse(char *Brr)
{
	char *start = Brr;
	char *end = Brr;
	char temp = '\0';

	while(*end != '\0')
	{
		end++;
	}
	end--;

	while(end>start)
	{
		temp = *start;
		*start = *end;
		*end = temp;

		start++;
		end--;
	}
}
int main()
{
	char Arr[30]="\0";

	printf("Enter String\n");
	scanf("%s",Arr);

	StringReverse(Arr);

    printf("Reverse String is : %s\n",Arr);

	return 0;
}