/*
 Write a java program which accept string from user and check
whether it contains vowels in it or not.

Input : “marvellous”

Output : TRUE

Input : “Demo”

Output : TRUE

Input : “xyz”

Output : FALSE
*/
import java.util.Scanner;
class Vowel
{
	private String str ;
	public Vowel(String Brr)
	{
		str = Brr ;
	}
	public boolean checkVowel()
	{
		int ilength = str.length();
		int i = 0;
		boolean bCheck = false ;
		char Crr[] = str.toCharArray();
		for(i=0;i<ilength;i++)
		{
			if((Crr[i]=='a')||(Crr[i]=='e')||(Crr[i]=='i')||(Crr[i]=='o')||(Crr[i]=='u')||(Crr[i]=='A')||(Crr[i]=='E')||(Crr[i]=='I')||(Crr[i]=='O')||(Crr[i]=='U'))
	        {
	        	bCheck = true ;
	        	break;
	        }	
		}
		return bCheck;
	}
}
class Program5
{
	public static void main(String arg[])
	{
		boolean bRet = false ;
		Scanner sobj = new Scanner(System.in);
		String Arr ;
		System.out.println("Enter String");
		Arr = sobj.nextLine();

		Vowel vobj = new Vowel(Arr);
        bRet = vobj.checkVowel();

        if(bRet==true)
        {
        	System.out.println("It contains Vowel");
        }
        else
        {
        	System.out.println("It does not contain Vowel");
        }

	}
}