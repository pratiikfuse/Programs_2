//. Write a program which checks whether 7th & 15th & 21st , 28th bit is On or OFF. 4
 #include<stdio.h>
#include<stdbool.h>
bool CheckBit(int iNo)
{
    int iMask=0x04103030;
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
        printf("5th and 18th bit is ON\n");
    }
    else
    {
        printf("Bits are OFF\n");
    }
    return 0 ;
}