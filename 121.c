//Write a program which checks whether 15th bit is On or OFF. 
#include<stdio.h>
#include<stdbool.h>
bool CheckBit(int iNo)
{
    int iMask = 0x00004000;
    int iResult = 0;
    iResult = iMask & iNo ;

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
    printf("Enter Number \n");
    scanf("%d",&iValue);

    bRet=CheckBit(iValue);
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