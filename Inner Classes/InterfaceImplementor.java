
interface A{
	void show();
}

class InterfaceImplementor{

	public static void main(String[] args) {
		
		A a=new A(){
			
			public void show(){
				
				System.out.println("Overridden successfully.");
			
			}
		
		};
		a.show();
	}

}