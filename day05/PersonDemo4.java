/*
this语句：用于构造函数之间进行互相调用

this语句只能定义在构造函数的第一行。因为初始化要先执行。
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
		//Person(name);//构造函数调用不能这样写
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