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
	//������ν���� bcs����Ϊ��̬�����������ļ��ض�����,ִֻ��һ�Σ�����������������
	public static void main(String[] args)
	{
		new StaticCode(4);    //����������� a c54 d
	}
}
