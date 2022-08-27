/*
Write a program which accept one number from user and on its first 4
bits. Return modified number
*/
#include<stdio.h>
int ToggleBit(int iNo)
{
    int iMask = 0x000000F;
    int iResult = iMask & iNo ;
    if(iMask!=iResult)
    {
       iNo = iMask ^ iNo;
    }
    return iNo;
}
int main()
{
    int iValue = 0;
    int iRet = 0 ;
    printf("Enter Number\n");
    scanf("%d",&iValue);

    iRet=ToggleBit(iValue);
    printf("Modified Number is : %d\n",iRet);
    return 0 ;
}