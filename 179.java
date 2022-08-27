/*
Write Java program which accept String from user and display
below pattern.
Input : Hello
Output :  H
          H   e
          H   e   l
          H   e   l   l
          H   e   l   l   o
*/
import java.util.Scanner;
class Marvellous
{
	public void Display(String s)
	{
		char Arr[]=s.toCharArray();
		int i , j = 0;
		for(i=1;i<=Arr.length;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.printf("%c\t",Arr[j]);
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
		System.out.println("Enter String");
		String str = sobj.nextLine();

		Marvellous mobj = new Marvellous();
		mobj.Display(str);

	}
}