import java.util.Scanner;
class StringExp
{           
	String p="My name is Arpit Agrawal";
	void show()
	{
		System.out.println(p);
	}
	public static void main(String args[])
	{  
		Scanner sc=new Scanner(System.in);
		StringExp e=new StringExp();
		System.out.println(e.p.length());
		System.out.println(e.p.charAt(0));
		System.out.println(e.p.substring(3));
		System.out.println(e.p.substring(3,7));
		System.out.println(e.p.contains("hello"));
		//e.p.format("%3d",5);
		e.p=e.p.concat("BABU");
	//	e.p=String.join("-","my","name","is","Arpit","Agrawal");
		//e.p=e.p.replace("pit","arpit agrawal");
		e.p=e.p.toLowerCase();
		e.show();
	} 
}  