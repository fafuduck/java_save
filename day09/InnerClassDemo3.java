/*
�ڲ��ඨ���ھֲ�ʱ��
1.�����Ա���Ա���η�����
2.����ֱ�ӷ����ⲿ���еĳ�Ա����Ϊ�������ⲿ���е�����
	���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�����
*/
class Outer
{
	int x = 3;
	void method(final int a)
	{
		final int y = 4;
		class Inner  //�ֲ��ڲ��಻�ܶ��徲̬��Ա
		{
			void function()
			{
				System.out.println(y);
			}
		}
		new Inner().function();
	}
}
class InnerClassDemo3 
{
	public static void main(String[] args) 
	{
		new Outer().method(7);
	}
}
