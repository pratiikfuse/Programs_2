/*
Write a program which accept one number , two positions from user and
check whether bit at first or bit at second position is ON or OFF.

Input :  10   position : 2   4
Output : TRUE
*/  
#include<stdio.h>
#include<stdbool.h>

bool CheckBit(int iNo,int iPos1,int iPos2)
{
  int iMask1 = 0x00000001;
  iMask1 = iMask1<<(iPos1-1);

  int iMask2 = 0x00000001;
  iMask2 = iMask2<<(iPos2-1);

  if(((iMask1 & iNo)==iMask1)||((iMask2 & iNo)==iMask2))
  {
  	return true;
  }
  else
  {
  	return false ;
  }
}
int main()
{
	int iValue = 0;
	int iNo1,iNo2 = 0;
	bool bRet = false;
	printf("Enter number\n");
	scanf("%d",&iValue);

	printf("Enter first position\n");
	scanf("%d",&iNo1);
	printf("Enter second position\n");
	scanf("%d",&iNo2);

	bRet = CheckBit(iValue,iNo1,iNo2);

	if(bRet==true)
	{
		printf("Bits are ON\n");
	}
	else
	{
		printf("Bits are OFF\n");
	}

	return 0 ;
}