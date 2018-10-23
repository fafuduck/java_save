abstract class Animal
{
	abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("吃鱼");
	}
	public void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("吃骨头");
	}
	public void kanjia()
	{
		System.out.println("看家");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("饲料");
	}
	public void gongDi()
	{
		System.out.println("拱地");
	}
}
class  DuotaiDemo
{
	public static void main(String[] args) 
	{
		//Cat c = new Cat();
		//c.eat();

		//Dog d = new Dog();
		//d.eat();

		//1.多态的体现
		//Animal c1 = new Cat();
		//c1.eat();

		
		
	}
}
