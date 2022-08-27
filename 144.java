/*
Write a java program which accept string from user and return
difference between frequency of small characters and frequency
of capital characters.
Input : “MarvellouS”

Output : 6 (8-2)
*/
import java.util.Scanner;
class CountFreq
{
	private String str ;
	public CountFreq(String Brr)
	{
		str = Brr ;
	}
	private int CountCapital()
	{
		int length = str.length();
		int i = 0;
		char Crr[]= str.toCharArray();
		int Ccount = 0;
		for(i=0;i<length;i++)
		{
			if((Crr[i]>='A')&&(Crr[i]<='Z'))
			{
				Ccount++;
			}
		}
		return Ccount;
	}
	private int CountSmall()
	{
		int length = str.length();
		int i = 0;
		char Srr[]= str.toCharArray();
		int Scount = 0;
		for(i=0;i<length;i++)
		{
			if((Srr[i]>='a')&&(Srr[i]<='z'))
			{
				Scount++;
			}
		}
		return Scount;
	}
	public int Freq()
	{
		int Capital = 0;
		int Small = 0;
		int freq = 0;
		Capital = this.CountCapital();
		Small  = this.CountSmall();

		freq  = Small - Capital ;
		return freq ;
	}
}
class Program4
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		String Arr ;
		int iRet = 0;
		System.out.println("Enter String");
		Arr = sobj.nextLine();

		CountFreq cobj = new CountFreq(Arr);
		iRet=cobj.Freq();
        
        System.out.println("Difference is Frequency of small cas Letter and Capital Case letter is : "+iRet);

	}
}