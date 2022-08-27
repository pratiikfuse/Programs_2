/*
Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 3 iCol = 4
Output : 
          1   1   1   1
          2   2   2   2
          3   3   3   3
          4   4   4   4
*/

import java.util.*;
class Marvellous
{
	public void Display(int iRow,int iCol)
	{
		int i,j = 0;
		for(i=1;i<=iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.printf("%d\t",i);
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

		Marvellous mobj = new Marvellous();
		mobj.Display(iValue1,iValue2);


	}
}