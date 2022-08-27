/*
Write a java program which accept number of rows and number of
columns from user and display below pattern.
*/
import java.util.Scanner;
class Pattern
{
	public void Display(int iRow,int iCol)
	{
      int i , j = 0;
     int no1 = 0;
      for(i=0;i<iRow;i++)
      {
      	for(j=1;j<=iCol;j++)
      	{
      		if(j<(iRow-no1))
      		{
      			System.out.printf("*\t");
      		}
      		else if(j==(iRow-no1))
      		{
      			System.out.printf("#\t");
      		}
      		else
      		{
      			System.out.printf("@\t");
      		}
      	}
      	no1++;
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

		Pattern pobj = new Pattern();
		pobj.Display(iValue1,iValue2);

	}
}