/*
Write a java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 6 iCol = 6
Output : 
*	*	*	*	*	*	
*				*	*	
*			*		*	
*		*			*	
*	*				*	
*	*	*	*	*	*
        
*/
import java.util.Scanner;
class Pattern
{
	public void Display(int iRow,int iCol)
	{
		int i , j  = 0;
		int no = 0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(j==iCol)
				{
					System.out.printf("*\t");
				}
				else if(j==1)
				{
					System.out.printf("*\t");
				}
				else if(j==(iCol-no))
				{
					System.out.printf("*\t");
				}
				else if((i==iRow)||(i==1))
				{
					System.out.printf("*\t");
				}
				else
				{
					System.out.printf("\t");
				}
			}
			System.out.println();
			no++;
		}

	}
}
class Program3
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