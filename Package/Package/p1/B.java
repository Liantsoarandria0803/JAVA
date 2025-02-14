package p1;
import p2.C;
public class B 
{
	public int b;
	public A a;
	public C c;
	public B(int as)
	{
		b=as;
	}   
	public void show(){
		System.out.println("Class B:");
		System.out.println(b);
		System.out.println("B using C:");
		this.createC();
		c.show();
	} 
	public void createA()
	{
		a=new A(12);
	}
	public void createC()
	{
		c=new C(13);
	}
}
