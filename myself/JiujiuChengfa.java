class JiujiuChengfa  //99�˷��� 
{
	public static void main(String[] args) 
	{
		int z; // z��������x*y�ĳ˻���Ϊ���ó�����С�����Ұ�x��y�������ŵ�forѭ������ȥ������for���������Ǿ��Զ���ʧ���Ϳ����ͷ��ڴ�

		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				z = x * y;
				System.out.print("x*y="+z+" ");
			}
			System.out.println();  //����ֻ�𵽻��е�����
		}

	}
}