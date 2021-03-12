package demo;

public class NestedClass {
	public static void main(String args[])
	{
		Parent p=new Parent();
		Parent.Child c=new Parent.Child();
		c.display();
		A a=new A();
		A.B b=a.new B();
		b.display(5, 3);
	}

}

class Parent
{
	static int a=10;
	public void show()
	{
		
	}
	  static class Child
	{
		 void display()
		{
			System.out.println(a);
		}
	}
}
class A{
	int a=100;
	 public void show(){
		System.out.println(a);
	}
	class B{
		void display(int x,int y)
		{
			System.out.println(x+y);
		}
	}
}


