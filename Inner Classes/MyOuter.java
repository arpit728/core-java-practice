class MyOuter
{
	private int x=100;

	class MyInner{

		public void showOuter(){

			System.out.println("The outer x is = "+x);
			System.out.println("Reference to Inner class instance is "+this);
			System.out.println("Reference to outer class instance is "+getOuterClassInstance());

		}

		class MostInner{

			public void showInnerMost(){
				System.out.println("Hey, I am the InnerMost.");
			}
		}
	}
	MyOuter getOuterClassInstance(){
		return this;
	}
	public static void main(String[] args) {
		MyOuter.MyInner.MostInner mi=new MyOuter().new MyInner().new MostInner();
		mi.showInnerMost();
	}
}