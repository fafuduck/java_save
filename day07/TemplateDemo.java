/*
���󣺻�ȡһ�γ������е�ʱ��
ԭ����ȡ����ʼ�ͽ�����ʱ�䲢������ɡ�

��ȡʱ�䣺System.currentTimeMillis();

����������Ż��󣬾Ϳ��Խ���������⡣

���ַ�ʽ������ģ�淽�����ģʽ

ʲô��ģ�淽����
�ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ�������һ�����ǲ�ȷ���ģ���ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ���
��ô��ʱ�ͽ���ȷ���Ĳ��ֱ�¶��ȥ���ɸ��������ȥ���
*/
abstract class Gettime
{
	public final void getTime()
	{
		long start = System.currentTimeMillis();

		runcode();

		long end = System.currentTimeMillis();

		System.out.println("����: "+(end-start));
	}
	public abstract void runcode();
}

class Subtime extends Gettime
{

	public void runcode()
	{
		for(int x=0; x<4000; x++)
		{
			System.out.println(x);
		}
	}
	
}

class TemplateDemo 
{
	public static void main(String[] args) 
	{
		//Gettime gt = new Gettime();
		Subtime gt = new Subtime();
		gt.getTime();
	}
}
