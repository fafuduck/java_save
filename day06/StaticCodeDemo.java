/*
��̬�����.
��ʽ��
static
{
	��̬������е�ִ����䡣
}

�ص㣺������ļ��ض�ִ�У�ִֻ��һ��,��������������
���ڸ�����г�ʼ���ġ�

*/

class StaticCode
{
	int num = 54;
	StaticCode()
	{
		System.out.println("b");
	}
	static
	{
		System.out.println("a"+this.num);
	}

	{
		System.out.println("c")
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
	static
	{
		//System.out.println("b");
	}
	public static void main(String[] args) 
	{
		new StaticCode(4); // a c d 
		//new StaticCode();
		//new StaticCode();
		//System.out.println("over");
		//StaticCode.show();
	}
	static
	{
		//System.out.println("c");
	}
}


//d:\>java\day06\java StaticCodeDemo

//b c a over