/*
3.�Ӹ����еĹ��캯��

�ڶ����������г�ʼ��ʱ������Ĺ��캯��Ҳ������
������Ϊ���๹�캯��Ĭ�ϵ�һ����һ�����ص���� super()��
super()������ʸ����пղ����Ĺ��캯�����������������й��캯��Ĭ�ϵ�һ�ж���super()

Ϊʲô����һ��Ҫ���ʸ����еĹ��캯��.

��Ϊ�����е������������ֱ�ӻ�ȡ��������������ڽ���ʱ����Ҫ�Ȳ鿴��������ζ���Щ���ݽ��г�ʼ����
���������ڶ����ʼ��ʱ��Ҫ�ȷ���һ�¸����еĹ��캯����
���Ҫ���ʸ�����ָ���Ĺ��캯��������ͨ���ֶ�����super���ķ�ʽ��ָ����

ע�⣺super���һ�����������๹�캯���ĵ�һ��


�����ʵ�������̣�

���ۣ�
��������еĹ��캯����Ĭ�϶�����ʸ����пղ����Ĺ��캯����
��Ϊ����ÿһ�����캯���ڵĵ�һ�ж���һ�����ص�super()

��������û�пղ����Ĺ��캯��ʱ����������ֶ�ͨ��super����this�����ʽ��ָ��Ҫ���ʸ����еĹ��캯����

��Ȼ������Ĺ��캯����һ��Ҳ�����ֶ�ָ��this��������ʱ����еĹ��캯����������������һ�����캯������ʸ����еĹ��캯��

*/
class Fu //extends Object  ��ţ�ļ̳�
{
	Fu()
	{

		System.out.println("fu run");
	}
	Fu(int x)
	{
		System.out.println("fu..."+x);
	}
	
}
class Zi extends Fu
{
	Zi()
	{
		//super();   ��������ص�һ�仰  �����Ĭ�Ϸ�ʽ
		//super(4);  //������ֶ���ʽ
		System.out.println("zi run");
	}
	Zi(int x)
	{
		//super(3);
		System.out.println("zi..."+x);
	}
}
class  ExtendsDemo3
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		System.out.println(zi.num);
	}
}

/*
class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	void show(){}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
	void method()
	{
		super.show();
	}
}
*/