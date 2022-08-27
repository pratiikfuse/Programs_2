/*
Write a java program which accept string from user and count
number of small characters.

Input : “Marvellous”

Output : 9
*/
import java.util.*;
class CountSmall
{
	public static int Display(String str)
	{
		int length = str.length();
		char Brr[] = str.toCharArray();
		int i = 0;
		int Count = 0;

		for(i=0;i<length;i++)
		{
			if((Brr[i]>='a')&&(Brr[i]<='z'))
			{
				Count++;
			}
		}
		return Count;
	}
}
class Program3
{
  public static void main(String arg[])
  {
  	String Arr ;
  	Scanner sobj = new Scanner(System.in);
  	System.out.println("Enter String");
    Arr=sobj.nextLine();

    int iRet = CountSmall.Display(Arr);
    System.out.println("Count of small letters are :"+iRet);
  }
}