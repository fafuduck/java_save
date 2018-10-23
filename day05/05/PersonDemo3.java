class Person
{
	private String name;
	private int age;

	
	Person(int age)
	{
		this.age = age;   //this�ʹ�������࣬�൱�� Person.age=age; ǰ�ߵ�age���ǵ�4���б�private��age��������Ǵ�main�����д��ͽ����ģ����͵��β�age��
	}

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	Person(String name)
	{
		this.name = name;
	}

	public void speak()  //���˶���һ��˵�����ܣ�����˵���Լ��������Լ�����
	{
		System.out.println("name="+this.name+", "+"age="+this.age);
	}

	public void show() // ��������һ���Լ��Ĳ��գ���ʱ��˯��
	{
		System.out.println("sleep");
	}

	public boolean compare(Person p)  //����һ�����ܱȽ��������Ƿ���ͬ����   ���ڸñȽ�ֻ��һ���ӿڣ����Ը�ʽΪp1.compare(p2)
	{
		return this.age == p.age;
	}
}

class  PersonDemo3
{
	public static void main(String[] args) 
	{
		Person p = new Person("����",23);
		p.speak();
		p.show();
		//p.age = 5;    error ��Ϊ Person���е�age��˽�еģ�ֻ����Person����ʹ��

		Person p1 = new Person(23);
		Person p2 = new Person(23);
		boolean pe = p1.compare(p2);
		System.out.println(pe);
	}
}
