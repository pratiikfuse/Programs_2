/*
Write Java program which accept N numbers from user and display
all such elements which are divisible by 5.
N : 6
Elements : 85  66  3  80  93  88
Output : 85  80 
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
   public Logic(int Length)
   {
   	super(Length);
   }
   public void Display()
   {
   	 int iCnt = 0;
   	 System.out.println("Number Divisible By 5 are : ");
   	   for(iCnt=0;iCnt<Arr.length;iCnt++)
   	   {
   	 	if((Arr[iCnt]%5)==0)
   		{
   			System.out.printf("%d\t",Arr[iCnt]);
   		}
   	   }
   	   System.out.println();
   	}

     
 }
class Program2
{
	public static void main(String arg[])
	{
	  Scanner sobj = new Scanner(System.in);
	  int iSize = 0;
	  System.out.println("Enter Size of Array");
	  iSize = sobj.nextInt();
      
      Logic lobj = new Logic(iSize);
      lobj.Display();
	}
}
