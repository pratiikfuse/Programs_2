/*
Write a program which accept one number from user and check whether
9th or 12th bit is on or off.
Input :  257
Output : TRUE

1  0  0   1   
*/
#include<stdio.h>
#include<stdbool.h>

bool CheckBit(int iNo)
{
	
	if(((0x00000100 & iNo)==0x00000100)||(((0x00000800 & iNo))==0x00000800))
	{
		return true;
	}
	else
	{
		return false;
	}
}
int main()
{
	int iValue  = 0;
	bool bRet = false;

	printf("Enter Number\n");
	scanf("%d",&iValue);

	bRet = CheckBit(iValue);

	if(bRet==true)
	{
		printf("Bit are ON\n");
	}
	else
	{
		printf("Bits are oFF\n");
	}
	return 0;
}