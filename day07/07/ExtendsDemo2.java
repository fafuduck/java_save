class Fu  //����
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
		System.out.println("fu show");
	}
	void speak()
	{
		System.out.println("vb");
	}
}

class Zi extends Fu
{
	void show2()
	{
		System.out.println("zi show");
	}
	void speak()
	{
		System.out.println("java");
	}
}
class ExtendsDemo2 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		z.show1();
		z.show2();
	}
}

class Tel
{
	void show()
	{
		System.out.println("number");
	}
}

class Newtel extends Tel
{
	void show()
	{
		super.show();  // super���ǵ��ø����еķ������߱���
		System.out.println("name");  //�µĵ绰����˵�������˵�����
		System.out.println("photo");  // Ҳ������ʾ�������˵���Ƭ
	}
}
