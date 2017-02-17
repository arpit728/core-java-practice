//Reading data from keyboard using console class
class ConsoleInput
{
	public static void main(String[]args)
	{
		System.out.println("Enter your name");
		char[]name=System.console().readPassword();
		System.out.println("Welcome "+name);
	}
}