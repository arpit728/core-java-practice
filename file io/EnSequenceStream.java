import java.io.*;
import java.util.*;
class EnSequenceStream
{
	public static void main(String[]args)throws IOException
	{
		/*try
		{*/
			FileInputStream fin1=new FileInputStream("f1.txt");
			FileInputStream fin2=new FileInputStream("f2.txt");
			FileInputStream fin3=new FileInputStream("f3.txt");
			Vector<InputStream> v=new Vector<InputStream>();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);
			Enumeration<InputStream> e=v.elements();
			SequenceInputStream sis=new SequenceInputStream(e);
			int i;
			while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
				if((char)i=='r')
				{
					System.out.println();
				}
			}
			sis.close();
			fin1.close();
			fin2.close();
			fin3.close();
		/*}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
	}
}