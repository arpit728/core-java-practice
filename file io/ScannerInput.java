import java.util.*;
class ScannerInput
{
	public static void main(String[]args)
	{
		String input = "10 tea 20 coffee 30 tea buiscuits";  
		Scanner sc=new Scanner(input).useDelimiter("\\s");
		 System.out.println(sc.nextInt());  
		 System.out.println(sc.next());  
		 System.out.println(sc.nextInt());  
		 System.out.println(sc.next());
		 System.out.println(input);
	}
}