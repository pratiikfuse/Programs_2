/*
Write a program which accept one number from user and off 7th bit of that
number if it is on. Return modified number.
*/
#include<stdio.h>
#include<stdbool.h>
int OFFBit(int iNo)
{
    int iMask = 0x00000040;
    int iResult = iMask & iNo ;
    if(iResult==iMask)
    {
        iNo = iNo ^ iMask;
    }
    return iNo;
}
int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter Number\n");
    scanf("%d",&iValue);

    iRet=OFFBit(iValue);
    printf("Modified Number is :%d\n",iRet);
    return 0 ;
}