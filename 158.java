/*
Write java program which accept N numbers from user and accept
one another number as NO , return index of first occurrence of that
NO.
*/
import java.util.Scanner;
class ArrayX
{
	public int Arr[];
	ArrayX(int iLength)
	{
		Arr = new int[iLength];
		Accept();
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Elements");
		int i = 0;
		for(i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
	}
} 
class Logic extends ArrayX 
{
	public Logic(int length)
	{
		super(length);
	}
	public int Index(int iNo)
	{
		int i = 0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==iNo)
			{
				break;
			}
		}
		return i ;
	}
}
class Program2
{
	public static void main(String arg[])
	{
	Scanner sobj = new Scanner(System.in);
	int iSize = 0 ;
	System.out.println("Enter Size of Array");
	iSize = sobj.nextInt();
	System.out.println("Enter Number which index you want to check");
	int iValue = 0;
	iValue = sobj.nextInt();
	
	Logic lobj = new Logic(iSize);
	int iRet= 0;
	iRet = lobj.Index(iValue);

	System.out.println("Index of Given number is : "+iRet);
    }

}