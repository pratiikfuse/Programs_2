/*
Write a program which accept number from user and return the
count of digits in between 3 and 7.
Input : 2395
Output : 1

Input : 1018
Output : 0

Input :4521
Output : 2

Input : 9922
Output : 0
*/
import java.util.Scanner;
class DigitX
{
	public int CountDigit(int iNo)
	{
		int iCnt = 0;
		int iDigit  = 0;
		while(iNo!=0)
		{
			iDigit = iNo % 10 ;
			if((iDigit>3)&&(iDigit<7))
			{
				iCnt++;
			}
			iNo = iNo/10 ;
		}
		return iCnt ;
	}
}
class Program3
{
	public static void main(String arg[])
	{
		int iValue = 0 ;
		System.out.println("Enter Number");
		Scanner sobj = new Scanner(System.in);
		iValue = sobj.nextInt();
        int iRet = 0;
		DigitX dobj = new DigitX();
		iRet=dobj.CountDigit(iValue);
		System.out.println("Count of  Digit between 3 & 7 is : "+iRet);

	}
}