/*
��̬����������Ϊ������ڵĶ���������̬

�ˣ�man��woman

����:è����

è x = new è();

���� x = new è();

1.��̬������
	���������ָ�����Լ����������
	���������Ҳ���Խ����Լ����������
2.��̬��ǰ��
	������������֮���й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
	ͨ������һ��ǰ��:���ڸ���
3.��̬�ĺô�
	��̬�ĳ��ִ�������˳������չ�ԡ�
4.��̬�ı׶�
	�������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա��
5.��̬��Ӧ��

*/

/*
���è����
*/
abstract class Animal
{
	abstract void eat();
}


class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchMouse()
	{
		System.out.println("ץ����");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void kanjia()
	{
		System.out.println("����");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void gongDi()
	{
		System.out.println("����");
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

		//1.��̬������
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

	public static void function(Animal a) //main����дfunction(new Cat());�൱��
										//Animal a = new Cat();
	{
		a.eat();
	}
}