class Forfor
{
	public static void main(String[] args)
	{

		/*
		for(int x = 0; x<4; x++)
		{
			for(int y = 0; y<4; y++)
			{
				System.out.print("*");
			}
			System.out.println();//ֻ��һ�����ܾ��ǻ���
		}

		*/
		
		/*
		for(int x = 0; x<5; x++)
		{
			for(int y = 5; y>x; y--)
			{
				System.out.print("*");
			}	
			System.out.println();
		}
		*/
		
		/*
		for(int x = 1; x<=5; x++)
		{
			for(int y = 1; y<=x; y++)
			{
				System.out.print(y);
			}
			System.out.println();
		}
	1
	12
	123
	1234
	12345
		*/

		//�žų˷���
		int z;
		for(int x = 1;x<=3; x++)
		{
			for(int y = 1; y<=x; y++)
			{
				z = x * y;
				System.out.print(" x*y="+z);
			}
			System.out.println();
		}
	}

}