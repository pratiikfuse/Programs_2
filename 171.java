/*
Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 3 iCol = 4
output : 1    2    3    4
         5    6    7    8 
         9   10   11   12
*/

import java.util.Scanner;
class Marvellous
{
	public static void Display(int iRow,int iCol)
	{
		int i, j = 0;
		int no = 1;
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++,no++)
			{
				System.out.printf(no+"\t");
			}
			System.out.println();
		}
	}
}
class Program5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int iValue1 = sobj.nextInt();
		System.out.println("Enter number of columns");
		int iValue2 = sobj.nextInt();

		Marvellous.Display(iValue1,iValue2);
	}
}