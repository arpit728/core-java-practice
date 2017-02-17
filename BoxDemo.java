class Box
{
	private double width;
	private double height;
	private double depth;
	Box(Box ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	double volume()
	{
		return(width*height*depth);
	}
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight(BoxWeight ob)
	{
		super(ob);
	}
	BoxWeight(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight=m;
	}
}
class BoxDemo
{
	public static void main(String[]args)
	{
		BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
		BoxWeight mybox2=new BoxWeight(mybox1);
		double vol;
		vol=mybox1.volume();
		System.out.println(vol);
		vol=mybox2.volume();
		System.out.println(vol);
	}
}