class PopCorn{
	void pop(){
		System.out.println("Hey, I am a popped corn.");
	}

	public static void main(String[] args) {
		PopCorn p=new PopCorn(){
			void pop(){
				System.out.println("I am just a flavour");
			}
			void temp(){
				System.out.println("Hey, I belong to anonymous inner class.");
			}
		};
		p.pop();
		p.temp();
	}
}
class A{
	public void show(){
		System.out.println("Hey, I am extended");
	}
}