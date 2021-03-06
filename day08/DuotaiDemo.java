/*
多态：可以理解为事物存在的多种体现形态

人：man、woman

动物:猫、狗

猫 x = new 猫();

动物 x = new 猫();

1.多态的体现
	父类的引用指向了自己的子类对象。
	父类的引用也可以接受自己的子类对象。
2.多态的前提
	必须是类与类之间有关系，要么继承，要么实现。
	通常还有一个前提:存在覆盖
3.多态的好处
	多态的出现大大的提高了程序的扩展性。
4.多态的弊端
	提高了扩展性，但是只能使用父类的引用访问父类中的成员。
5.多态的应用

*/

/*
动物，猫、狗
*/
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

//-----------------------------------------------

class DuotaiDemo 
{
	public static void main(String[] args) 
	{
		//Cat c = new Cat();
		//c.eat();

		//Dog d = new Dog();
		//d.eat();

		//Cat c = new Cat();

		/*
		Cat c1 = new Cat();
		function(c1);
		function(new Dog());
		*/

		//1.多态的体现
		//Animal c = new Cat();
		//c.eat();

		function(new Cat());
		function(new Dog());
		function(new Pig());


	}
	/*
	public static void function(Cat c)//Cat c = new Cat();
	{
		c.eat;
	}
	public static void function(Dog d)
	{
		c.eat;
	}
	*/

	public static void function(Animal a) //main里面写function(new Cat());相当于
										//Animal a = new Cat();
	{
		a.eat();
	}
}
