class Person
{
	//�ӵ�4�е���12�ж��ǹ���
	/*
	{
	cry();
	}

	Person()
	{
		System.out.println("get");
	}

	public void cry()
	{
		System.out.println("cry...");
	}
	*/

	private String name;
	private int age;

	Person(String n)
	{
		name = n;
		System.out.println("A:name="+name+","+"age="+age);
	}

	Person(String n, int a)
	{
		name = n;
		age = a;
		System.out.println("B:name+"+name+","+"age="+age);
	}
}

class PersonDemo2 
{
	public static void main(String[] args) 
	{
		//Person p = new Person("����");   //�����������оͻ�����23�У� ��������ΪA:name=����,age=0�� ע�⣺age = 0
		Person p1 = new Person("����",10);
		
	}
}