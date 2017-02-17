class TestObj{
	public static void main(String[] args) {
		Object o=new Object(){
			public boolean equals(Object o){
				return true;
			}
		};
		System.out.println(o.equals("fred"));
	}
}