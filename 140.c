/*
Write a program which accept one number from user and range of
positions from user. Toggle all bits from that range.
Input : 897  Range : 9  13
Toggle all bits from position 9 to 13 of input number ie 879.

1111 1111 1111 1111 1111 1111 1111 1111 << iMask1

1111 1111 1111 1111 1111 1111 1111 1111 >> iMask2

0000 0000 0000 0000 0001 1111 0000 0000  Expected Mask

1111 1111 1111 1111 1111 1111 0000 0000  iMask1 
                                        &
0000 0000 0000 0000 0001 1111 1111 1111  iMask2
_______________________________________ 

0000 0000 0000 0000 0001 1111 0000 0000  = iMask (We Got the mask)
                                        ^
0000 0000 0000 0000 0000 0000 0000 1111  iNo
_______________________________________
0000 0000 0000 0000 0001 1111 0000 1111  = iResult
*/
#include<stdio.h>
typedef unsigned int UINT;

UINT ToggleRange(UINT iNo,int iStart,int iEnd)
{
  UINT iMask1 = 0xFFFFFFFF;
  iMask1 = iMask1<<(iStart-1);

  UINT iMask2 = 0xFFFFFFFF;
  iMask2 = iMask2>>(32-iEnd);

  UINT iMask = iMask1 & iMask2 ;
  
  UINT iResult = iMask ^ iNo ;

  return iResult;

}
int main()
{
	UINT iValue = 0;
	int iFirst = 0;
	int iLast = 0;
    UINT iRet = 0;
	printf("Enter Number\n");
	scanf("%d",&iValue);

	printf("Enter starting position\n");
	scanf("%d",&iFirst);
	printf("Enter Ending Position\n");
	scanf("%d",&iLast);

	iRet = ToggleRange(iValue,iFirst,iLast);

	printf("Updated Number : %u \n",iRet);

	return 0;
}