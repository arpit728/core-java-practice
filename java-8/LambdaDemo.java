import java.util.*;
class LambdaDemo{
	
	public static void main(String[] args) {
		
		Integer []a={1,2,3,8,7,10,9};
		String s[]={"a","b","c"};
		Arrays.asList(a).sort((e1,e2)->
		{
			return e1.compareTo(e2);

		});
		System.out.print(Arrays.toString(a));

	}
}