/*
Write a program which 2 strings from user and check whether
contents of two strings are equal or not.
Input :
“Marvellous Infosystems”
“Marvellous Infosystems”

Output : TRUE
*/
import java.util.Scanner;
class Marvellous
{
  public boolean CheckString(String Arr,String Brr)
  {
     boolean bCheck = false ;
     bCheck = Arr.equals(Brr);
     return bCheck ;
  }
}
class Program2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sobj.nextLine();
		System.out.println("Enter Second String");
		String str2 = sobj.nextLine();

		Marvellous mobj = new Marvellous();
		boolean bRet = false ;
		bRet = mobj.CheckString(str1,str2);

		if(bRet==true)
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are not same");
		}
	}
}
