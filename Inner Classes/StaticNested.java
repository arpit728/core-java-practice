class A{
	static class Nest{
		void show(){
			System.out.println("Nested Show");
		}
	}
}

class StaticNested extends A.Nest{
	public static void main(String[] args) {
		StaticNested s=new StaticNested();
		s.show();
	}
}