abstract class Shape
{
	abstract void run();
}
class Rectangle extends sShape
{
	void run()
	{
		System.out.println("DRAWING RECTANGLE");
	}
}
class Circle extends Shape
{
	void run()
	{
		System.out.println("DRAWING CIRCLE");
	}
}
class TestShape
{
	public static void main(String[]args)
	{
		Shape s=new Rectangle();
		s.run();
	}
}