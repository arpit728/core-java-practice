import java.io.*;
class KeyboardInput
{
	public static void main(String[]args)throws Exception
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.print("welcome "+name);
	}
}