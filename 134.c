/*
Write a program which accept one number and position from user and
toggle that bit. Return modified number
*/
#include<stdio.h>
int ToggleBit(int iNo,int iPlace)
{
    if((iPlace>32)||(iPlace<1))
    {
        return -1;
    }
   int iMask = 0x00000001;
   iMask = iMask<<(iPlace-1);


    iNo = iMask ^ iNo ;
  
   return iNo;

}
int main()
{
    int iValue,iPos,iRet = 0;
    printf("Enter Number\n");
    scanf("%d",&iValue);
    printf("Enter Position\n");
    scanf("%d",&iPos);
    iRet=ToggleBit(iValue,iPos);
    printf("Modified Numbr is : %d\n",iRet);
    return 0 ;
}

