/*
Write a program which accept one number from user and toggle contents
of first and last nibble of the number. Return modified number. (Nibble is a
group of four bits
*/
#include<stdio.h>
typedef unsigned int UINT ;
UINT CheckBit(UINT iNo)
{

    int iMask = 0x00000000;
     if(iNo<=15)
     {iMask = 0x0000000F;
      iNo = iMask ^ iNo ;
      return iNo;
     }
    else if(iNo>15)
    {
        iMask = 0x000000FF;
        iNo = iMask^iNo;
        return iNo;
    }
 

}
int main()
{
    UINT iValue,iRet = 0;
    printf("Enter Number\n");
    scanf("%d",&iValue);
    iRet=CheckBit(iValue);
    printf("Modified Numbr is : %d\n",iRet);
    return 0 ;
}

