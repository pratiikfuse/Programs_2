/*
Write java program which accept N numbers from user and accept
Range, Display all elements from that range
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
	public void Display(int iStart , int iEnd)
	{
	  int i = 0;
	  System.out.printf("Numbers in the Range which are Available : ");
	  for(i=0;i<Arr.length;i++)
	  {
	  	if((Arr[i]>iStart)&&(Arr[i]<iEnd))
	  	{
	  		System.out.printf("%d\t",Arr[i]);
	  	}
	  }
	  System.out.println();
	}
}
class Program4
{
	public static void main(String arg[])
	{
	Scanner sobj = new Scanner(System.in);
	int iSize = 0 ;
	System.out.println("Enter Size of Array");
	iSize = sobj.nextInt();
	int iFirst = 0;
	int iLast = 0;
	System.out.println("Enter First number of Range");
	iFirst = sobj.nextInt();
	System.out.println("Enter Last number of Range");
	iLast = sobj.nextInt();

	Logic lobj = new Logic(iSize);
	lobj.Display(iFirst,iLast);
    }

}
