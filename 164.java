/*
Write a program which 2 strings from user and check whether
first N contents of two strings are equal or not.
Note : If third parameter is greater than the size of second string
then concat whole string after first string.
Input :
“Marvellous Infosystems”
“Marvellous Logic Building”
10
Output : TRUE
*/
import java.util.Scanner;
class Marvellous
{
	public boolean CheckEqual(String s1 , String s2,int iNo)
	{
         char Arr[] = s1.toCharArray();
         char Brr[] = s2.toCharArray();
         int i = 0;
         boolean bFlag = true;

         for(i=0;i<iNo;i++)
         {
           if(Arr[i]!=Brr[i])
           {
           	bFlag = false;
           }
         }
         return bFlag;
	}
}
class Program3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sobj.nextLine();
		System.out.println("Enter second string");
		String str2 = sobj.nextLine();

		System.out.println("Enter Number");
		int iValue = sobj.nextInt();

		Marvellous mobj = new Marvellous();
		
        if(iValue<=str2.length())
        {
          boolean bRet = mobj.CheckEqual(str1,str2,iValue);
          if(bRet==true)
          {
		  System.out.println("Strings first "+iValue+" Elements are Equal");
	      }
	      else
	      {
	    	System.out.println("Strings first"+iValue+" Elements are not Equal");
	      }
	    }
	    else
	    {
	    	System.out.println(str1+" "+str2);
	    }



	}
}