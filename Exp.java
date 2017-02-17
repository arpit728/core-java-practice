import java.util.regex.*;
import java.util.Scanner;  
class Exp
{  
	public static void main(String args[])
	{  
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", sc.next()));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  
	}  
}