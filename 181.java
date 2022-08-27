/*
Write Java program which accept String from user and display
below pattern.
Input : Hello
Output :
         H
         H   e
         H   e   l
         H   e   l   l
         H   e   l   l   o
         H   e   l   l
         H   e   l
         H   e   
         H   
*/

import java.util.Scanner;
class Marvellous
{
	public void Display(String s)
	{
		char Arr[] = s.toCharArray();
		int i,j = 0;
		for(i=1;i<=Arr.length;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(Arr[j]+"\t");
			}
			System.out.println();
		}
		for(i=(Arr.length-1);i>=1;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(Arr[j]+"\t");
			}
			System.out.println();
		}

	}
}
class Program5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sobj.nextLine();
        Marvellous mobj = new Marvellous();
        mobj.Display(str);
	}
}