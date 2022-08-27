/*
Write Java program which accept String from user and display
below pattern.
Input : Hello
Output:
        H	#	#	#	#	
        H	e	#	#	#	
        H	e	l	#	#	
        H	e	l	l	#	
        H	e	l	l	o
*/
import java.io.*;
class Pattern
{
	public void Display(String s)
	{
		char Arr[]=s.toCharArray();
		int i,j = 0;
		for(i=1;i<=Arr.length;i++)
		{
			for(j=0;j<Arr.length;j++)
			{
				if(j<i)
				{
					System.out.printf("%c\t",Arr[j]);
				}
				else
				{
					System.out.printf("#\t");
				}
			}
			System.out.println();
		}
	}
}
class Program3
{
	public static void main(String arg[]) throws Exception
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);

		System.out.println("Enter String");
		String str = bobj.readLine();

		Pattern pobj = new Pattern();
		pobj.Display(str);
	}
}