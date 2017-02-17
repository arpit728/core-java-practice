
public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder("Hey,I am mutable.");
		System.out.println(stringBuilder);
		
		stringBuilder.setLength(10);
		System.out.println(stringBuilder);
		char a[]={'a','r','p','i','t'};
		
		stringBuilder.append(a,1,3);//appends 3 elements starting from index 1 to string builder
		
		stringBuilder.insert(1, false);//inserts "false at index 1 of the string builder";
		
		stringBuilder.insert(5, a);
		
		System.out.println(stringBuilder);
		stringBuilder.append("Hey, I am expanded by 10 characters");
		
	}

}
