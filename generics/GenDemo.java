class Gen<T>
{

	T ob;
	
	Gen(T ob){
		this.ob=ob;
	}
	
	T getOb(){
		return ob;
	}
	
	void show(){
		System.out.println("The type of ob is : "+ob.getClass().getName());
	}
}

class GenDemo{
	
	public static void main(String[] args) {
		Gen<String>g1=new Gen<String>("Arpit");
		g1.show();
		System.out.println(g1.getOb());

		Gen<Integer>g2=new Gen<Integer>(new Integer(10));
		g2.show();
		System.out.println(g2.getOb());
		
		Gen<Double>g3=new Gen<Double>(new Double(12.5));
		g3.show();
		System.out.println(g3.getOb());	
	}
}