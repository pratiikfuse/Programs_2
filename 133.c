/*
Write a program which accept one number and position from user and on
that bit. Return modified number.
*/
#include<stdio.h>
#include<stdbool.h>
int CheckBit(int iNo,int iPlace)
{
   int iMask = 0x00000001;
   iMask = iMask<<(iPlace-1);
   int iResult = iMask & iNo;
   if(iMask!=iResult)
   {
       iNo = iMask ^ iNo ;
   }
   return iNo;

}
int main()
{
    int iValue,iPos,iRet = 0;
    printf("Enter Number\n");
    scanf("%d",&iValue);
    printf("Enter Position\n");
    scanf("%d",&iPos);
    iRet=CheckBit(iValue,iPos);
    printf("Modified Numbr is : %d\n",iRet);
    return 0 ;
}

