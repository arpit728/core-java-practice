import java.io.*;
class ByteArrayOPS
{
	public static void main(String[]args)
	{
		try
		{
			String s="java Developer";
			byte b[]=s.getBytes();
			FileOutputStream fout1=new FileOutputStream("f1.txt");
			FileOutputStream fout2=new FileOutputStream("f2.txt");
			ByteArrayOutputStream bout=new ByteArrayOutputStream();
			bout.write(b);
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			bout.flush();  
			bout.close(); 
			System.out.println("success...");  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}