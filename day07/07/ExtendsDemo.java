//将学生和工人的共性提取，单独进行描述；
//只要让学生和工人与单独描述这个类有关系。
class Person
{
	String name;
	int age;

}

class Student extends Person
{
	void study()
	{
		System.out.println("good study");
	}
}

class Worker extends Person
{
	void work()
	{
		System.out.println("good work");
	}
}
class  ExtendsDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
