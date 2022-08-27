//Write a program which checks whether 7th & 8th & 9th bit is On or OFF
#include<stdio.h>
#include<stdbool.h>
bool CheckBit(int iNo)
{
    int iMask = 0x00001C0 ;
    int iResult = 0;
    iResult = iNo & iMask ;
    if(iResult==iMask)
    {
        return true ;
    }
    else
    {
        return false;
    }
}
int main()
{
    int iValue=0;
    bool bRet = false ;
    printf("Enter Number\n");
    scanf("%d",&iValue);
    bRet=CheckBit(iValue);
    if(bRet==true)
    {
        printf("Bits are ON\n");
    }
    else{
        printf("Bits are OFF\n");
    }
    return 0;
}