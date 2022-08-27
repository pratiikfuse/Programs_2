/*
Write a program which accept number from user and return
multiplication of all digits.
Input : 2395
Output : 270

Input : 1018
Output : 8

Input : 9440
Output : 144

Input : 922432
Output : 864
*/
import java.util.Scanner;
class DigitX
{
	public int MulDigit(int iNo)
	{
		int iDigit  = 0;
		int iMul = 1 ;
		while(iNo!=0)
		{    
			iDigit = iNo % 10 ;
			if(iDigit!=0)
			{
			  iMul = iMul * iDigit ;
			}
			  iNo = iNo/10;
		    
		}
		return iMul;
	}
}
class Program4
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
		System.out.println("Multiplication of all digits is : "+iRet);

	}
}