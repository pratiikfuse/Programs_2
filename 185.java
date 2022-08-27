import java.io.*;
class Pattern
{
	public void Display(String s)
	{
		char Arr[]= s.toCharArray();
		int i,j = 0;
		for(i=Arr.length;i>=1;i--)
		{
			for(j=0;j<Arr.length;j++)
			{
				if(j<i)
				{
					System.out.print(Arr[j]+"\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
		for(i=2;i<=Arr.length;i++)
		{
		  for(j=0;j<Arr.length;j++)
		  {
		  	if(j<i)
		  	{
		  		System.out.printf("%c\t",Arr[j]);
		  	}
		  	else
		  	{
		  		System.out.printf("*\t");
		  	}
		  }
		  System.out.println();
		}
	}
}
class Program4
{
	public static void main(String arg[])
	{
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		try
		{
		 String str = bobj.readLine();
		 Pattern pobj = new Pattern();
		 pobj.Display(str);
	    }
	    catch(Exception obj)
	    {
	    	System.out.println("Eception Occured : "+obj);
	    }
	    finally
	    {
	    	System.out.println("Program terminated ");
	    }



	}
}