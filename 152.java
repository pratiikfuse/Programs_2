/*
Write a java program which accept number from user and return the
count of even digits.
Input :  2395
Output :  1
Input :  1018
Output : 2
Input :   -1018
Output : 2
Input :  8462
Output : 4
*/
import java.util.Scanner;
class DigitX
{
	public int CountEven(int iNo)
	{
		int iCnt = 0;
		int iDigit = 0;
		while(iNo!=0)
		{
			iDigit = iNo % 10 ;
			if((iDigit%2)==0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt ;
	}
}
class Program1
{
	public static void main(String arg[])
	{
     Scanner sobj = new Scanner(System.in);
     int iValue = 0;
     System.out.println("Enter Number");
     iValue = sobj.nextInt();
     DigitX dobj = new DigitX();
     int iRet = 0 ;
     iRet=dobj.CountEven(iValue);

     System.out.println("Count of even digit is : "+iRet);

	}
}