class FunctionOverload
{
	public static void main(String[] args)
	{
		add(4,5);
		add1(4,5,6);
		System.out.println("Hello java!");
		print99(4);
	}

	//����һ���ӷ����㣬��ȡ���������ĺ�
	public static int add(int x, int y)
	{
		return x+y;
	}

	//����һ���ӷ�����ȡ���������ĺ�
	public static int add1(int x,int y, int z)
	{
		return x+y+z;
	}


	//���ܵĴ�ӡ99�˷���
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
	//��ӡ99�˷���
	public static void print99()
	{
		print99(9);
	}

/*
	//��ӡ99�˷���Դ��
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

