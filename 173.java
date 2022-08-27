/*
Write Java program which accept number of rows and number of
columns from user and display below pattern.
input : iRow = 4 iCol = 3
output : 
          1   2   3
          1   2   3
          1   2   3
          1   2   3
*/
import java.util.*;
class Marvellous
{
	public void Display(int iRow,int iCol)
	{
		int i,j = 0;
		for(i=0;i<iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
              System.out.printf("%d\t",j);
			}
			System.out.println();

		}

	}
}
class Program2
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