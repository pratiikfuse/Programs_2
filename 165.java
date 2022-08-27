/*
Accept sing from user and reverse the contents of that string
by toggling the case.
Input : “aCBdef”
Output : “FEDcbA”
*/
import java.io.*;
class Marvellous
{
	public String ReverseCapital(String s)
	{
		char Arr[] = s.toCharArray();
		int end = (Arr.length-1);
		char temp[] = new char[1];
		int i = 0;

		for(i=0;i<end;i++,end--)
		{
          temp[0] = Arr[i];
          Arr[i]=Arr[end];
          Arr[end]=temp[0];
		}
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='A')&&(Arr[i]<='Z'))
			{
			 Arr[i]= (char)((int)Arr[i]+32);
			}
			else if((Arr[i]>='a')&&(Arr[i]<='z'))
			{
              Arr[i]= (char)((int)Arr[i]-32);
			}
		}
		s = String.valueOf(Arr);
		return s;


	}
}
class Program4
{
	public static void main(String arg[])
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);

		System.out.println("Enter the String");

		try{
		String str = bobj.readLine();

		Marvellous mobj = new Marvellous();

		String sRet = mobj.ReverseCapital(str);

		System.out.println("Reverse String with toggled Case is : "+sRet);
	    }
	    catch(Exception obj)
	    {}

		
	}
}