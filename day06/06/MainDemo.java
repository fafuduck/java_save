class  MainDemo 
{
	public static void main(String[] args)   // new String []
	{
		String[] arr = {"hah","hehe","xixi","hiahia"};

		MainTest.main(arr);  //���������class MainTest


		

	}
}

class MainTest
{
	public static void main(String[] args)
	{
		for(int x=0; x<args.length; x++)
			System.out.println(args[x]);
	}
}


/*
MainDemo.java������public static void main(String[] args)��ԭ��
��ʵ��public static void main(String[] args)���ֵ�ʱ����� ������һ��new String[]
*/