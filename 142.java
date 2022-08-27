/*Write a Java program which accept string from user and count
number of capital characters.

Input : “Marvellous Multi OS”

Output : 4
*/
import java.util.Scanner;
class Count
{
	public static int Display(String Brr)
	{
		int i = 0;
		int iCnt = 0;
		int Length = Brr.length();
	    char Crr[] = Brr.toCharArray();
	    for(i=0;i<Length;i++)
	    {
	   	if((Crr[i]>='A')&&(Crr[i]<='Z'))
	   	{
	   		iCnt++;
	   	}
	    }
	    return iCnt;

	} 
}
class Ass31_1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		String Arr;
		System.out.println("Enter String");
		Arr = sobj.nextLine();
		int iRet = Count.Display(Arr);

		System.out.println("capital letters are :"+iRet);
	}
}