/*
Write a program which accept one number from user and count number of
ON (1) bits in it without using % and / operator.
input : 11 
output : 3

0   0   0   0   1   1   0   0 
*/
#include<stdio.h>
typedef unsigned int UINT ;
int CountBit(UINT iNo)
{
    int iCnt = 0;
    int iResult = 0;
    int i = 0;
    UINT iMask = 0x00000001;
    
    for( i=0; i<32 ; i++,iMask=iMask<<1 )
    {
      iResult = iMask & iNo ;
       if(iResult==iMask)
       {
        iCnt++;
       }
    }
    return iCnt;    
}
int main()
{
    UINT iValue = 0;
    int iRet = 0;
    printf("Enter Number\n");
    scanf("%d",&iValue);

    iRet=CountBit(iValue);
    printf("ON Bits are %d\n",iRet);

    return 0;
}