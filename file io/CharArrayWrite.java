import java.io.*;
class CharArrayWrite
{
	public static void main(String[]args)
	{
		try
		{
			CharArrayWriter out=new CharArrayWriter();
			out.write("I want to make an exceptional java programmer");
			FileWriter fout1=new FileWriter("a.txt");
			FileWriter fout2=new FileWriter("b.txt");
			FileWriter fout3=new FileWriter("c.txt");
			FileWriter fout4=new FileWriter("d.txt");
			out.writeTo(fout1);
			out.writeTo(fout2);
			out.writeTo(fout3);
			out.writeTo(fout4);
			
			fout1.close();
			fout2.close();
			fout3.close();
			fout4.close();
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}