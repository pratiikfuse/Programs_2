/*
Write a program which accept one number from user and toggle 7th bit of
that number. Return modified number
input : 137
output : 201
*/
#include<stdio.h>
int ToggleBit(int iNo)
{
    int iMask = 0x00000040;
    int iResult = iMask ^ iNo ;

    return iResult;
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