/*
Write Java program which accept number of rows and number of columns
from user and display below pattern.
iRow = 3 , iCol = 5

    A   A   A   A   A
    B   B   B   B   B
    C   C   C   C   C
*/
import java.util.Scanner;
class Marvellous
{
	public static void Display(int iRow,int iCol)
	{
       int i , j = 0;
       char ch  = 'A';
       for(i=0;i<iRow;i++)
       {
       	for(j=0;j<iCol;j++)
       	{
       		System.out.printf(ch+"\t");
       	}
       	ch++;
       	System.out.println();
       }
	}
}
class Program3
{
	public static void main(String arg[])
	{
		Scanner sobj =  new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int iValue1 = sobj.nextInt();
		System.out.println("Enter Number of columns");
		int iValue2 = sobj.nextInt();
		Marvellous.Display(iValue1,iValue2);
	}

}