class B{
	void show(){
		System.out.println("b's Show.");
	}
}

class A extends B{
	void show1(){
		System.out.println("b's Show.");
	}

	public static void main(String[] args) {
		
		B b=new A();
		//b.show1();
		A a=(A)b;//new A();
		a.show1();
	}

}