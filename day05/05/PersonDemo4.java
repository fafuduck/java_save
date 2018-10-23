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
		this(name); //µÈÍ¬ÓÚp(name)
		this.age = age;
	}
}

class  PersonDemo4
{
	public static void main(String[] args) 
	{
		Person p = new Person("lisi",30);
	}
}
