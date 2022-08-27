// reverse the String
import java.util.Scanner;
class Program6
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		String Arr ;
		String sRet ;
		System.out.println("Enter String");
		Arr = sobj.nextLine();

		Reverse robj = new Reverse(Arr);

		sRet = robj.stringReverse();

		System.out.println("Reverse String is : "+sRet);
	}
}
class Reverse
{
  public String str ;
  Reverse(String Brr)
  {
  	str = Brr ;
  }
  public String stringReverse()
  {
  	int iLength=str.length();
  	int j = (iLength-1);
  	int i = 0;
  	char Crr[] = str.toCharArray();
  	char temp ;

  	while(i<=j)
  	{
  	  temp = Crr[i];
  	  Crr[i]=Crr[j];
  	  Crr[j] = temp ;
  	  i++;
  	  j--;
  	}
  	String Srr = String.valueOf(Crr);
  	return Srr;
  }
}
