/*
Accept string from user and check whether the string is
palindrome or not without considering its case
*/
import java.util.Scanner;
class ReverseX
{
	public String srr ;
	public ReverseX(String str1)
	{
		srr = str1;
	}
	public String Rev()
	{
		int end = 0;
		int start = 0;
		char temp;
		end = (srr.length()-1);
		char Arr[]=srr.toCharArray();

		while(end>start)
		{
           temp = Arr[start];
           Arr[start]=Arr[end];
           Arr[end]=temp;

           start++;
           end--;
		}
		String rstr = new String(Arr);
		return rstr;
	}
}
class Logic extends ReverseX
{
	public Logic(String lstr)
	{
		super(lstr);
	}
	public boolean CheckPallindrome(String rstr)
	{
		boolean bCheck = false ;
		bCheck= srr.equalsIgnoreCase(rstr);
		return bCheck;
	} 
}
class Program5
{
	public static void main(String arg[])
	{
       Scanner sobj = new Scanner(System.in);
       String str ;
       System.out.println("Enter String");
       str =sobj.nextLine();

       Logic lobj = new Logic(str);
       boolean bRet = false ;
       String RevString = lobj.Rev();
       bRet = lobj.CheckPallindrome(RevString);

       if(bRet==true)
       {
       	System.out.println("String is Pallindrome");
       }
       else
       {
       	System.out.println("String is not Pallindrome");
       }
	}
}