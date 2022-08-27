/*
Write a program which accept two numbers from user and display position
of common ON bits from that two numbers.
Input :   10  15   
Output :  2   4   

*/
#include<stdio.h>
typedef unsigned int UINT ;

void DisplayCommon(int iNo1,int iNo2)
{
   int iSame =  iNo1 & iNo2;
   int iResult = 0;
   int i = 0;
   int iMask = 0x00000001;
   printf("Position of common bits are : ");
   for(i=1;i<=32;i++)
   {
   	 iResult = iMask & iSame ;
   	 if(iResult==iMask)
   	 {
   	   printf("%d\t",i);
   	 }
   	 iMask = iMask<<1;
   }
   printf("\n");
}
int main()
{
	int iValue1 = 0;
	int iValue2 = 0;

	printf("Enter First number\n");
	scanf("%d",&iValue1);

	printf("Enter Second number\n");
	scanf("%d",&iValue2);

	DisplayCommon(iValue1,iValue2);

	return 0 ;
}