/*
����һ�����ͻ������֮��Ӧ�Ĺ��캯����

���캯�������ã��������ڸ�������г�ʼ��

���캯����Сϸ�ڣ�
��һ������û�ж��幹�캯��ʱ����ôϵͳ��Ĭ�ϸ��������һ���ղ����Ĺ��������
Person(){}

���������Զ����˹��캯����Ĭ�ϵĹ��캯����û����

���캯����һ�㺯����д�����в�ͬ

��������Ҳ�в�ͬ
���캯�����ڶ���һ���������У��������ʼ��
��һ�㷽���Ƕ�����ò�ִ�У��Ǹ�������Ӷ���߱��Ĺ���

һ�������������캯��ֻ����һ��
��һ�㷽�����Ա��ö�����ö��

ʲôʱ���幹�캯���أ�
��������ʱ����������ھ߱�һЩ���Ի�����Ϊ����ô����Щ���ݶ����ڹ��캯����
*/

class Person
{
	private String name;
	private int age;
	

	/*
	��������
	���ã���������г�ʼ��
	����һ���������У����������ڹ��캯��ִ�С�
	�͹��캯��������
	���������Ǹ����ж������ͳһ��ʼ��
	�����캯���Ǹ���Ӧ�Ķ����ʼ��

	���������ж�����ǲ�ͬ�����Եĳ�ʼ������
	*/
	{
		//System.out.println("person code run");
		cry();
	}

	Person()
	{
		System.out.println("A:name="+name+",,age="+age);
		
	}

	/*
	public void setName()
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	*/
	
	Person(String n)
	{
		name = n;
		System.out.println("B:name="+name+",,age="+age);
	}


	Person(String n,int a)
	{
		name = n;
		age = a;
		System.out.println("C:name="+name+",,age="+age);
	}
	
	public void cry()
	{
		System.out.println("cry......");
	}
}

class PersonDemo2
{
	public static void main(String[] args)
	{
		Person p1 = new Person();

		//Person p2 = new Person("lisi");
		//p2.setName("libusi");
		//System.out.println(p2.getName);

		//Person p3 = new Person("wangwu",10);
	}
}