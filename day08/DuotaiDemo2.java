/*
��̬���������Ϊ������ڵĶ���������̬

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

6.��̬�ĳ��ִ����е��ص㣨��̬ʹ�õ�ע�����

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

class DuotaiDemo2 
{
	public static void main(String[] args) 
	{
		Animal a = new Cat(); //��������.  byte b = 2��int x = b�� b�ʹ�byte���int
								//����ת��
		a.eat();

		//�����Ҫ����è�����з���ʱ����β�����
		//ǿ�ƽ���������ã�ת����������,����ת��
		Cat c = (Cat)a;
		c.catchMouse();
		//ǧ��Ҫ���������Ĳ��������ǽ��������ת���������͡�
		//������ת�����Ǹ���Ӧ��ָ�����Լ����������ʱ����Ӧ�ÿ��Ա�������Ҳ���Ա�ǿ��ת��
		//��̬��ʼ���ն���������������ű任
	//	Animal a = new Animal;
	//	Cat c = (Cat)a;
/*
		����ү x = new ����ʦ();
		x.����();
		����ʦ y = (����ʦ)x
		x.����Ӱ
*/
	}
	public static void function(Animal a) 
	{
		a.eat();
		
		if(a instanceof Cat) //instanceof
		{
		Cat c= (Cat)a;
		c.catchMouse;
		}
		else if(a instanceof Dog)
		{
			Dog c= (Dog)a;
			c.kanjia();
		}
	}
}
