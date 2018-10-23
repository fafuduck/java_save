class FunctionDemo
{
	public static int getResult(int num)
	{
		return num * 3 + 5;
	}

	public static void main(String[] args)
	{
		int x = getResult(4);
		System.out.println("x="+x);
	}
}

/*
先明确函数定义的格式：

修饰符 返回值类型 函数名(参数类型 形式参数1，参数类型 形式参数2...)
{
	执行语句；
	return 返回值；
}
*/

