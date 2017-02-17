import java.io.*;
class PipedIO
{
	public static void main(String[]args)throws Exception
	{
		final PipedInputStream pin=new PipedInputStream();
		final PipedOutputStream pout=new PipedOutputStream();
		pout.connect(pin);
		Thread t1=new Thread()
		{
			public void run()
			{
				try	
				{
					for(int i=0;i<65;i++)
					{
						pout.write(i);
						Thread.sleep(1000);
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
			
					for(int i=0;i<65;i++)
					{
						try{System.out.println(pin.read());}
						catch(Exception e){System.out.println(e);}
					}
			}
		};
		t1.start();
		t2.start();
	}
}