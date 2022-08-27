/*
Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 3 iCol = 5
Ouptut :   5   4   3   2   1
           5   4   3   2   1
           5   4   3   2   1          
*/
import java.util.Scanner;
class Marvellous
{
	public void  Display(int iRow,int iCol)
	{
		int i,j = 0;
		for(i=0;i<iRow;i++)
		{
			for(j=iCol;j>=1;j--)
			{
               System.out.printf("%d\t",j);
			}
			System.out.println();
		}

	}
}
class Program3
{
	public static void main(String arg[])
	{
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter number of Rows");
      int iValue1 = sobj.nextInt();
      System.out.println("Enter number of Columns");
      int iValue2 = sobj.nextInt();

      Marvellous mobj = new Marvellous();
      mobj.Display(iValue1,iValue2);
	}
}