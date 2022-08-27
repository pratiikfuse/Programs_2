/*
Write Java program which accept N numbers from user and display
all such elements which are even and divisible by 5.
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
 public void Display()
 {
   int iCnt = 0;
   System.out.printf("Numbers Which are divisible by 5 and even are :\t");
   for(iCnt=0;iCnt<Arr.length;iCnt++)
   {
  	if(((Arr[iCnt]%5)==0)&&((Arr[iCnt]%2)==0))
  	{
  		System.out.printf("%d\t",Arr[iCnt]);
  	}
   }
   System.out.println();
 }

}
class Program3
{
	public static void main(String arg[])
	{ Scanner sobj = new Scanner(System.in);
	  int iSize = 0;
	  System.out.println("Enter Size of Array");
	  iSize = sobj.nextInt();
	  Logic lobj = new Logic(iSize);
	  lobj.Display();

	}
}