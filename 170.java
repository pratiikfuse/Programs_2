/*
Write Java program which accept number of rows and number of columns
from user and display below pattern
input : iRow = 4  iCol = 5
output :  
           4   4   4   4   4
           3   3   3   3   3
           2   2   2   2   2
           1   1   1   1   1
*/

import java.util.*;
class Marvellous
{
	public static void Display(int iRow,int iCol)
	{
		int i , j = 0;
		int p = iRow;
		System.out.println("Pattern :");
		for(i=iRow;i>=1;i--)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.printf(i+"\t");
			}
			System.out.println();
		}
	}
}
class Program4
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int iValue1 = sobj.nextInt();
		System.out.println("Enter numbe of columns");
		int iValue2 = sobj.nextInt();

		Marvellous.Display(iValue1,iValue2);
	}
}