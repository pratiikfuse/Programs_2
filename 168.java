/*
Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 4 iCol = 4
output :
           A  B  C  D
           a  b  c  d
           A  B  C  D
           a  b  c  d
*/
import java.util.Scanner;
class Marvellous
{
	public static void Display(int iRow,int iCol)
	{
		int i , j = 0;
		char capital = 'A';
		char small = 'a';
		for(i=1;i<=iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
              if((i%2)==0)
              {
              	System.out.printf("%c\t",small);
              	small++;
              }
              else
              {
              	System.out.printf("%c\t",capital);
              	capital++;
              }
			}
			small = 'a';
			capital = 'A';
			System.out.println();
		}
	}
}
class Program2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of Rows");
		int iValue1 = sobj.nextInt();

		System.out.println("Enter number of Columns");
		int iValue2 = sobj.nextInt();

       Marvellous.Display(iValue1,iValue2);
	}
}