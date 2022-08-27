/*
Write a program which accept one number from user and count number of
ON (1) bits in it without using % and / operator.
Input :  11
Output :  4
*/
#include<stdio.h>
typedef unsigned int UINT;

int CountBit(int iNo)
{
	if(iNo<=0)
	{
		return 0;
	}
	UINT iMask = 0x00000001;
    int iResult = 0;
    int iCnt = 0;
    int iSum = 0;
    while(iSum!=iNo)
    {
      iResult = iMask & iNo;
       if(iMask==iResult)
       {
    	iCnt++;
    	iSum = iSum + iResult ;
       }
     	iMask=iMask<<1;
	}
	return iCnt;
}

int main()
{
	int iRet = 0;
	int iValue = 0;
	printf("Enter Number\n");
	scanf("%d",&iValue);

	iRet = CountBit(iValue);

	printf("Count of On bits is : %d\n",iRet);
	return 0;
}

