/*Write java program which accept N numbers from user and return
product of all odd elements.
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
	public Logic(int Length)
	{
		super(Length);
	}
  public int OddProduct()
  {
  	int i = 0;
  	int Mul = 1;
  	for(i=0;i<Arr.length;i++)
  	{
  		if((Arr[i]%2)!=0)
  		{
  			Mul = Mul * Arr[i];
  		}
  	}
  	return Mul;
  }
}
class Program5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.println("Enter Size of an Array");
		iSize = sobj.nextInt();

		Logic lobj = new Logic(iSize);
		int iRet = 0;
		iRet = lobj.OddProduct();

		System.out.println("Prodcut of odd elements is : "+iRet);

	}
}