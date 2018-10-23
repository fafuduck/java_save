interface Inter
{
	public static final int NUM = 3;
	public abstract void show();
}
interface InterA
{
	public abstract void show();
}

class Test implements Inter //implements是实现的意思
{
	public void show(){}
}

class Demo
{
	public void function(){}
}

class Test extends Demo implements Inter,InterA
{
	public void show(){}
}

interface A
{
	void methodA();
}
interface B extends A
{
	void methodB();
}
interface C extends B
{
	void methodC();
}

class D implements C
{
	public void methodA(){}
	public void methodC(){}
	public void methodB(){}
}
class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
