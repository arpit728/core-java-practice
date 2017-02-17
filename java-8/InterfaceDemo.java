interface MyData{

	default void print(String str){
		if (!isNull(str)) {
			System.out.println("MyData print : "+str);

		}
	}

	default boolean isNull(String s){
		System.out.println("Interface null check");
		return s==null?true:"".equals(s)?true:false;
	}
}


class InterfaceDemo implements MyData{

	public boolean isNull(String s){
		System.out.println("Impl null check");
		return s==null?true:false;
	}

	public static void main(String[] args) {
		InterfaceDemo id=new InterfaceDemo();
		id.print("");
		id.isNull("abc");
	}
}