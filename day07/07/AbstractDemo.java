abstract class Student
{
	abstract void study(); //abstract ���ǳ������˼
	void sleep()
	{
		System.out.println("����");
	}
}

class ChongciStudent extends Student //extends���Ǽ̳е���˼
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
