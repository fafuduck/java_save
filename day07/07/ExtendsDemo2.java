class Fu  //父类
{
	private int num = 4;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return this.num;
	}
	void show1()
	{
		System.out.println("fu show");
	}
	void speak()
	{
		System.out.println("vb");
	}
}

class Zi extends Fu
{
	void show2()
	{
		System.out.println("zi show");
	}
	void speak()
	{
		System.out.println("java");
	}
}
class ExtendsDemo2 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show1();
		z.show2();
	}
}

class Tel
{
	void show()
	{
		System.out.println("number");
	}
}

class Newtel extends Tel
{
	void show()
	{
		super.show();  // super就是调用父类中的方法或者变量
		System.out.println("name");  //新的电话可以说出来电人的名字
		System.out.println("photo");  // 也可以显示出来电人的照片
	}
}
