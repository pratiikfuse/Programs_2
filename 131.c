/*
Write a program which accept one number and position from user and
check whether bit at that position is on or off. If bit is one return TRUE
otherwise return FALSE.
Input :10 2
Output : TRUE
*/
#include<stdio.h>
#include<stdbool.h>
bool CheckBit(int iNo,int iPlace)
{
   int iMask = 0x00000001;
   iMask = iMask<<(iPlace-1);
   int iResult = iMask & iNo;
   if(iMask==iResult)
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
    int iValue,iPos = 0;
    int bRet = false ;
    printf("Enter Number\n");
    scanf("%d",&iValue);
    printf("Enter Position\n");
    scanf("%d",&iPos);
    bRet=CheckBit(iValue,iPos);
    if(bRet==true)
    {
        printf("Bit is ON\n");
    }
    else
    {
        printf("Bit is OFF\n");
    }

    return 0 ;
}

