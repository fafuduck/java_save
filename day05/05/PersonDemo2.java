class Person
{
	//从第4行到第12行都是构造
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
		//Person p = new Person("张三");   //单独输入这行就会运行23行， 其输出结果为A:name=张三,age=0， 注意：age = 0
		Person p1 = new Person("李四",10);
		
	}
}
