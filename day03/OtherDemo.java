class OtherDemo
{
	public static void main(String[] args)
	{

		//break : ��������ѭ����ѡ��ṹ
		w:for(int x = 0; x<3; x++)
		{
			q:for(int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				break w;
			}
		}

		//continue��ֻ��������ѭ���ṹ
		//����ѭ�����ص㣺��������ѭ������ȥִ���´�ѭ��
		for(int x=1; x<3; x++)
		{
			if(x%2 == 1)
			   continue;	
			System.out.println("x="+x);	
		}
	}
}