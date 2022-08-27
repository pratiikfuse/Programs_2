/*
Write Java program which accept String from user and display
below pattern
Input : Hello
Output: H	e	l	l	o	
        H	e	l	l	*	
        H	e	l	*	*	
        H	e	*	*	*	
        H	*	*	*	*
*/
import java.util.Scanner;
class Pattern
{
	public void Display(String s)
	{
		char Arr[]=s.toCharArray();
		int i , j = 0;
		for(i=Arr.length;i>=1;i--)
		{
			for(j=0;j<Arr.length;j++)
			{
				if(j<i)
				{
					System.out.printf("%c\t",Arr[j]);
				}
				else
				{
					System.out.printf("*\t");
				}
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
		System.out.println("Enter String");
		String str = sobj.nextLine();

		Pattern pobj = new Pattern();
		pobj.Display(str);

	}
}