/*
Write a java program which accepts 2 strings from user and
concat N characters of second string after first string.Value of N
should be accepted from user.
Note : If third parameter is greater than the size of second string
then concat whole string after first string.
Input :
“Marvellous Infosystems”
“Logic Building”
5
Output :
“Marvellous Infosystems Logic”
*/
import java.util.Scanner;
class Marvellous
{
   public String concatX(String s1, String s2,int iNo)
   {
   	  char Arr[] = s2.toCharArray();
   	  char Brr[] = new char[iNo];
   	 
   	  int i = 0;
   	  for(i=0;i<iNo;i++)
   	  {
        Brr[i]=Arr[i];
   	  }
   	  s2 = String.valueOf(Brr);

   	  return (s1 + s2);
   }
}
class Program1 
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sobj.nextLine();
		System.out.println("Enter second string");
		String str2 = sobj.nextLine();

		System.out.println("Enter how many characters you want to concat after first string");
		int iValue = sobj.nextInt();

		Marvellous mobj = new Marvellous();
		String sRet= mobj.concatX(str1,str2,iValue);

		System.out.println("String is : "+sRet);


      
	}
}