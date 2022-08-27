/*
Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 3
output : 
         *   *   *
         *   *   *
         *   *   *
         *   *   *
*/
import java.util.Scanner;
class Marvellous
{
	public void Display(int iRow,int iCol)
	{
		int i , j = 0;
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.printf("*\t");
			}
			System.out.println();
		}
	}
}
class Program1
{
	public static void main(String arg[])
	{
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter number of Rows");
      int iValue1 = sobj.nextInt();
      System.out.println("Enter number of Columns");
      int iValue2 =  sobj.nextInt();

      Marvellous mobj = new Marvellous();
      mobj.Display(iValue1,iValue2);
	}
}