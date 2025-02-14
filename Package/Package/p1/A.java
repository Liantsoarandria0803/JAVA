package p1;

import p2.D;

public class A 
{
	public int att;
	public D d;
	public B b;
	public p2.C c;

	public A(int a) {
		att = a;
	}
	public  void createD() {
		d=new D(att);
	}
	public void showD()
	{
		
		d.show();
	}
	public void createB() 
	{
		this.b = new B(att);
	}
	public void showB()
	{
		   b.show();
	}
	public void show(){
		System.out.println("Class A:");
	}
	public void createC()
	{
		c=new p2.C(att);
	}
	public void showC()
	{
		c.show();
	}

}
