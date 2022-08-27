/*Write a program which checks whether first and last bit is On or
OFF. First bit means bit number 1 and last bit means bit number 32
*/
#include<stdio.h>
#include<stdbool.h>
bool CheckBit(int iNo)
{
    int iMask = 0x80000001;
    int iResult = iMask & iNo;
    if(iResult==iMask)
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
    int iValue = 0;
    bool bRet = false ;
    printf("Enter Number\n");
    scanf("%d",&iValue);

    bRet=CheckBit(iValue);

    if(bRet==true)
    {
        printf("Bits Are ON\n");
    }
    else
    {
      printf("Bits are OFF\n");
    }
    return 0 ;
}