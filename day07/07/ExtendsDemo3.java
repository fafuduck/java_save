class Fu //extends Object ��ţ�ļ̳�  ��ʵ�أ�ÿһ�������ж���һ�����صļ̳У���������֮Ϊ�ϵ��� Object
{
	Fu()
	{
		System.out.println("fu run");
	}

	Fu(int x)
	{
		System.out.println("fu.."+x);
	}
}

class Zi extends Fu
{
	Zi()
	{
		//super(); //��������ص�һ�仰, �����Ĭ�Ϸ�ʽ
		System.out.println("zi run");
	}
	Zi(int x)
	{
		System.out.println("zi..."+x);
	}
}
class ExtendsDemo3 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi();
		System.out.println(zi.num);
	}
}
