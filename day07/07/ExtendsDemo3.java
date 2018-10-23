class Fu //extends Object 最牛的继承  其实呢，每一个父类中都有一个隐藏的继承，这个父类称之为上帝类 Object
{
	Fu()
	{
		System.out.println("fu run");
	}

	Fu(int x)
	{
		System.out.println("fu.."+x);
	}
}

class Zi extends Fu
{
	Zi()
	{
		//super(); //这个是隐藏的一句话, 这个是默认方式
		System.out.println("zi run");
	}
	Zi(int x)
	{
		System.out.println("zi..."+x);
	}
}
class ExtendsDemo3 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		System.out.println(zi.num);
	}
}
