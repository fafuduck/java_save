/*
privata: ˽�У�Ȩ�����η��������������еĳ�Ա����Ա��������Ա��������
˽��ֻ�ڱ�������Ч��

��age˽�л��Ժ������⼴ʹ�����˶���Ҳ����ֱ�ӷ��ʡ�
������Ӧ�������䣬����Ҫ��Person�����ṩ��Ӧ����age�ķ�ʽ��

ע�⣺˽�н����Ƿ�װ��һ�ֱ�����ʽ

֮���Զ����ṩ���ʷ�ʽ������������ڷ��ʷ�ʽ�м����߼��жϵ����
�Է��ʵ����ݽ��в�������ߴ���Ľ�׳�ԡ�
*/


class Person
{
	private int age;

	public void setAge(int a)
	{
		if(a>0 && a<130)
		{	
			age = a;
			speak();
		}
		else
			System.out.println("feifa age");
	}
	
	public int getAge()
	{
		return age;
	}
	
	void speak()
	{
		System.out.println("age="+age);
	}
}

class PersonDemo
{
	public static void main(String[] args)
	{
		Person p = new Person();
	
		//p.age = 20;
		p.setAge(20);
		p.speak();
	}
} 