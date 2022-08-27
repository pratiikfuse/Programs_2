/*
Write a program which accept number from user and return
difference between summation of even digits and summation of odd
digits.

Input :  2395
Output : -15 (2 - 17)

Input : 1018
Output : 6 (8 - 2)

Input : 8440
Output : 16 (16 - 0)

Input : 5733
Output : -18 (0 - 18)
*/
import java.util.Scanner;
class DigitX
{
	public int MulDigit(int iNo)
	{
		int iDigit  = 0;
		int SumOdd = 0;
		int SumEven = 0;
		while(iNo!=0)
		{    
			iDigit = iNo % 10 ;
		    if(iDigit%2==0)
		    {
		    	SumEven = SumEven + iDigit;
		    }
		    else
		    {
		    	SumOdd = SumOdd + iDigit ;
		    }
			  iNo = iNo/10;  
		}
		  return(SumEven-SumOdd);
	}
}
class Program5
{
	public static void main(String arg[])
	{
		int iValue = 0 ;
		System.out.println("Enter Number");
		Scanner sobj = new Scanner(System.in);
		iValue = sobj.nextInt();
        int iRet = 0;
		DigitX dobj = new DigitX();
		iRet=dobj.MulDigit(iValue);
		System.out.println("Difference between summation of Evend and Odd digits is : "+iRet);

	}
}