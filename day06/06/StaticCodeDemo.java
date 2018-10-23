class StaticCode
{
	int num = 54;
	StaticCode()
	{
		System.out.println("b");
	}
	static
	{
		System.out.println("a");
	}

	{
		System.out.println("c"+this.num);
	}

	StaticCode(int x)
	{
		System.out.println("d");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}

class StaticCodeDemo 
{
	/*
	static
	{
		System.out.println("b");
	}
		
	public static void main(String[] args) 
	{
		System.out.println("s");
	}
	static
	{
		System.out.println("c");
	}
	*/
	//上面这段结果是 bcs，因为静态代码块随着类的加载而加载,只执行一次，并且优先于主函数
	public static void main(String[] args)
	{
		new StaticCode(4);    //输入这个答案是 a c54 d
	}
}
