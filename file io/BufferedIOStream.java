import java.io.*;
class BufferedIOStream
{
	public static void main(String[]args)
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("f4.txt");
			FileInputStream fin=new FileInputStream("f4.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="I want To become java tycoon";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();  
			int i;
			while((i=bin.read())!=-1)
			{
				System.out.print((char)i);
			}
			bout.close();
			bin.close();
			fin.close();
			fout.close();
					
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}