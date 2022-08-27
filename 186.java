/*
*/
import java.io.*;
class Pattern
{
	public void Display(String s)
	{
		char Arr[]=s.toCharArray();
		int i,j = 0;
		for(i=1;i<=Arr.length;i++)
		{
			for(j=0;j<Arr.length;j++)
			{
				if(j<i)
				{
					System.out.print(Arr[j]+"\t");
				}
				else
				{
					System.out.printf("#\t");
				}
			}
			System.out.println();
		}
		for(i=(Arr.length-1);i>=1;i--)
		{
			for(j=0;j<Arr.length;j++)
			{
				if(j<i)
				{
					System.out.printf("%c\t",Arr[j]);
				}
				else
				{
					System.out.printf("#\t");
				}
			}
			System.out.println();
		}
	}
}
class Program5
{
	public static void main(String arg[])
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);

        try
        {
		System.out.println("Enter String");
		String str = bobj.readLine();

		Pattern pobj = new Pattern();
		pobj.Display(str);
	    }
	    catch(Exception obj)
	    {

	    }
	    finally
	    {
	    	System.out.println("Program terminated");
	    }
	}
}