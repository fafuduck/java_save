abstract class Student
{
	abstract void study(); //abstract 就是抽象的意思
	void sleep()
	{
		System.out.println("躺着");
	}
}

class ChongciStudent extends Student //extends就是继承的意思
{
	void study()
	{
		System.out.println("Chongci study");
	}
}

class BaseStudent extends Student 
{
	void study()
	{
		System.out.println("base study");
	}
}

class AdvStudent extends Student 
{
	void study()
	{
		System.out.println("adv study");
	}
}


class AbstractDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
