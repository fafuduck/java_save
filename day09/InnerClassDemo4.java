/*
�����ڲ��ࣺ
1.�����ڲ�����ʵ�����ڲ���ļ�д��ʽ
2.���������ڲ����ǰ�᣺
	�ڲ������̳�һ�������ʵ�ֽӿ�
3.�����ڲ���ĸ�ʽ�� new ������߽ӿ�(){�������������}
4.��ʵ�����ڲ������һ������������󣬶�����������е��֣��������Ϊ�����ݵĶ���
5.�����ڲ����ж���ķ�����ò�Ҫ����3��
*/
class AbsDemo
{
	abstract void show();
}

class Outer
{
	int x = 3;

	/*
	class Inner extends AbsDemo
	{
		void show()
		{
			System.out.println("show : "+x);
		}
	}
	*/

	public void  function()
	{
		//new Inner().show();
		new AbsDemo()  //��һ���־���������ɫ���ֵļ�д19-31��
		{
			void show()
			{
				System.out.println("x="+x);
			}
		}.show();

	}
}

class InnerClassDemo4 
{
	public static void main(String[] args) 
	{
		//new Outer().function();
	}
}
