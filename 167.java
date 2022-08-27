/*
Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 4 iCol = 4
output : A  B  C  D
         A  B  C  D
         A  B  C  D
         A  B  C  D
*/

import java.io.*;
class PatternX
{
	public static void Display(int iRow, int iCol)
	{
       int i , j  = 0;
       char ch = 'A';
       for(i=0;i<iRow;i++)
       {
       	 for(j=0;j<iCol;j++)
       	 {
           System.out.printf(" "+ch+"\t");
           ch++;
       	 }
       	 System.out.println();
       	 ch = 'A';
       }
	}
}
class Program1
{
	public static void main(String arg[]) throws Exception
	{
       BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Enter number of Rows");
       int iValue1 = Integer.parseInt(bobj.readLine());

       System.out.println("Enter number of Coloumns");
       int iValue2 = Integer.parseInt(bobj.readLine());

       PatternX pobj = new PatternX();
       pobj.Display(iValue1,iValue2);

	}
}