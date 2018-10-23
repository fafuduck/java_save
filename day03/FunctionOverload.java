class FunctionOverload
{
	public static void main(String[] args)
	{
		add(4,5);
		add1(4,5,6);
		System.out.println("Hello java!");
		print99(4);
	}

	//定义一个加法运算，获取两个整数的和
	public static int add(int x, int y)
	{
		return x+y;
	}

	//定义一个加法，获取三个整数的和
	public static int add1(int x,int y, int z)
	{
		return x+y+z;
	}


	//智能的打印99乘法表
	public static void print99(int num)
	{
		for(int x=1; x<=num; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
	//打印99乘法表
	public static void print99()
	{
		print99(9);
	}

/*
	//打印99乘法表源码
	public static void print99()
	{
		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
*/
}

