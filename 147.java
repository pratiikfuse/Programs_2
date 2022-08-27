/*
Write Java program which accept N numbers from user and return
difference between summation of even elements and summation of
odd elements.
Input : N : 6

Elements :85 66 3 80 93 88

Output : 53 (234 - 181)
*/
import java.util.Scanner;
class ArrayX
{
	public int Arr[];
	public ArrayX(int iLength)
	{
       Arr = new int[iLength]; 
       Accept();

   }
	public void Accept()
	{
	   int i = 0;
       Scanner sobj = new Scanner(System.in);
       System.out.println("Enter Elements");
       for(i=0;i<Arr.length;i++)
       {
       	 Arr[i]= sobj.nextInt();
       }
	}
}
class Logic extends ArrayX
{
	public Logic(int length)
	{
		super(length);
	}
	public int SumOdd()
	{
      int iCnt = 0 ;
      int Odd = 0;
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
      	if((Arr[iCnt]%2)==0)
      	{
         Odd = Odd+ Arr[iCnt];
      	}
      }
      return Odd;
	}
	public int SumEven()
	{
		int iCnt = 0;
		int Even = 0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]%2!=0))
			{
				Even = Even + Arr[iCnt];
			}
		}
		return Even;
	}
	public int Diff()
	{
      int iEven=this.SumOdd();
      int iOdd = this.SumEven();
      
      int Difference = iEven -iOdd;

      return Difference;
	}
}

class Program1
{
	public static void main(String arg[])
	{
	  int iSize = 0;
	  int iRet=0;
	  Scanner sobj = new Scanner(System.in);
      System.out.println("Enter size of Array");  
      iSize = sobj.nextInt();
      Logic lobj = new Logic(iSize);
      iRet=lobj.Diff();

      System.out.println("Differencer Between Summation of Even and Odd Elements is : "+iRet);

	}
}