/*
this��䣺���ڹ��캯��֮����л������

this���ֻ�ܶ����ڹ��캯���ĵ�һ�С���Ϊ��ʼ��Ҫ��ִ�С�
*/
class Person
{
	private String name;
	private int age;
	
	Person()
	{
	}
	Person(String name)
	{
		this.name = name;
	}
	Person(String name, int age)
	{
		//this.name = name;
		//Person(name);//���캯�����ò�������д
		this(name); // p(name);
		this.age = age;
	}
}

class PersonDemo4
{
	public static void main(String[] args)
	{
		Person p = new Person("lisi",30);
		
	}
}