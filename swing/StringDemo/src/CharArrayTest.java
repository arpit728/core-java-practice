import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class CharArrayTest {
	static char []a;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char a[]=new char[10];
		a=br.readLine().toCharArray();
		System.out.println(a.length);
	}

}
