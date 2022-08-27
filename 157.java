/*
Write java program which accept N numbers from user and accept
one another number as NO , check whether NO is present or not.
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
	public boolean CheckNumber(int iNum)
	{
		boolean bFlag = false ;
		int i = 0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==iNum)
			{
              bFlag = true;
              break;
			}
		}
		return bFlag;
	}
}
class Program1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		boolean bRet = false;
		System.out.println("Enter Size of Array");
		iSize = sobj.nextInt();
		System.out.println("Enter Number You Want to check in an Array");
		int iNo = sobj.nextInt();

		Logic lobj = new Logic(iSize);
		bRet=lobj.CheckNumber(iNo);

		if(bRet==true)
		{
			System.out.println("It is Present");
		}
		else
		{
			System.out.println("It is Not Present");
		}

	}
}