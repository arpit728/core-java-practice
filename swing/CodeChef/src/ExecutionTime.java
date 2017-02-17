import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExecutionTime {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		try {
			s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] tokens = s.split(",");
		System.out.println(s);
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
