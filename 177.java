/*
Write Java program which accept String from user and display
below pattern.
Input : Hello
Output : 
          H   e   l   l   o
          H   e   l   l   o
          H   e   l   l   o 
          H   e   l   l   o
*/
import java.util.Scanner;
class Marvellous
{
	public void Display(String s)
	{
      char Arr[] = s.toCharArray();
      int i = 0;
      int j = 0;
      for(i=0;i<Arr.length;i++)
      {
      	for(j=0;j<Arr.length;j++)
      	{
      		System.out.printf("%c\t",Arr[j]);
      	}
      	System.out.println();
      }
	}
}
class Program1
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