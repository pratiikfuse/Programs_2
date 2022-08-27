/*
Write a program which accept number from user and return the
count of odd digits.
Input :  2395
Output : 3
Input :  1018
Output : 2
Input :  -1018
Output : 2 
Input :  8462
Output : 0

*/
import java.util.Scanner;
class DigitX
{
	public int CountOdd(int iNo)
	{
		int iCnt = 0;
		int iDigit  = 0;
		while(iNo!=0)
		{
			iDigit = iNo % 10 ;
			if((iDigit%2)!=0)
			{
				iCnt++;
			}
			iNo = iNo/10 ;
		}
		return iCnt ;
	}
}
class Program2
{
	public static void main(String arg[])
	{
		int iValue = 0 ;
		System.out.println("Enter Number");
		Scanner sobj = new Scanner(System.in);
		iValue = sobj.nextInt();
        int iRet = 0;
		DigitX dobj = new DigitX();
		iRet=dobj.CountOdd(iValue);
		System.out.println("Count of Odd Digit is : "+iRet);

	}
}