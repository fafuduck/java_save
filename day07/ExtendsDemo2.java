/*
�Ӹ�����ֺ����Ա���ص�

���г�Ա��
1.����
2.����
3.���캯��

1.����
��������г��ַ�˽�е�ͬ����Ա����ʱ��
����Ҫ���ʱ����еı�������this
����Ҫ���ʸ����е���super

2.�Ӹ����еĺ���
��������ֺ͸���һģһ���ĺ���ʱ
�����������øú��������������ຯ��������
��ͬ����ĺ���������һ��

��������Ǻ�������һ������:��д�����ǣ�

������̳и��࣬��Ϯ�˸���Ĺ��ܵ�������
����������߱��ù��ܣ����ǹ��ܵ�����ȴ�͸��಻һ��
��ʱ��û�б�Ҫ�����¹��ܣ�����ʹ�ø������ԣ���������Ĺ��ܶ��壬����д����

���ǣ�
1.���า�Ǹ��࣬���뱣֤����Ȩ�޴��ڵ��ڸ���Ȩ�ޣ��ſ��Ը��ǣ��������ʧ��

2.��ֻ̬�ܸ��Ǿ�̬��


���أ�ֻ��ͬ�������Ĳ����б�
��д���Ӹ��෽��Ҫһģһ��
*/
class Fu
{
	private int num = 4;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return this.num;
	}
	void show1()
	{
		System.out.println("zi show");
	}
	void speak()
	{
		System.out.println("vb");
	}
}
class Zi extends Fu
{
	//int num = 5;
	void show2()
	{
		System.out.println("zi show");
	}
	void speak()
	{
		System.out.println("java");
	}
}

class  ExtendsDemo2
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show1();
		z.show2();
		//System.out.println(z.num1+"..."+z.num2);
	}
}

class Tel
{
	void show()
	{
		System.out.println("number");
	}
}

class NewTel extends Tel
{
	void show()
	{
		//System.out.println("number");
		super.show();
		System.out.println("name");
		System.out.println("photo");
	}
}