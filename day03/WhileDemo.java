class WhileDemo
{
	public static void main(String[] args)
	{
		/*

		
		
		
		int x = 1;
		while(x<3)
		{
			System.out.println("x="+x);
			x++;
		}
		*/




		int x = 1;
		do
		{
			System.out.println("do: x="+x);
			x++;
		}while(x<0);

		int y = 1;
		while(y<0)
		{
			System.out.println("y="+y);		
			y++;
		}
		/*
		while�����ж�������ֻ�����������ִ��ѭ���塣
		do while����ִ��ѭ���壬���ж��������������㣬�ټ���ִ��ѭ���塣
		��һ�仰��do while�����������Ƿ����㣬ѭ��������ִ��һ��
		*/
	}
}