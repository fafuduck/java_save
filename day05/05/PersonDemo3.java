class Person
{
	private String name;
	private int age;

	
	Person(int age)
	{
		this.age = age;   //this就代表这个类，相当于 Person.age=age; 前者的age就是第4行中被private的age，后面的是从main方法中传送进来的，传送到形参age上
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

	public void speak()  //给人定义一个说话功能，让他说出自己的姓名以及年龄
	{
		System.out.println("name="+this.name+", "+"age="+this.age);
	}

	public void show() // 让他们有一个自己的才艺，暂时用睡觉
	{
		System.out.println("sleep");
	}

	public boolean compare(Person p)  //定义一个功能比较两个人是否是同龄人   由于该比较只有一个接口，所以格式为p1.compare(p2)
	{
		return this.age == p.age;
	}
}

class  PersonDemo3
{
	public static void main(String[] args) 
	{
		Person p = new Person("张三",23);
		p.speak();
		p.show();
		//p.age = 5;    error 因为 Person类中的age是私有的，只能在Person类中使用

		Person p1 = new Person(23);
		Person p2 = new Person(23);
		boolean pe = p1.compare(p2);
		System.out.println(pe);
	}
}
