class Fu
{
	int num = 5;
	void method1()
	{
		System.out.println("fu method_1");
	}
	void method2()
	{
		System.out.println("fu method_2");
	}
	static void method4()
	{
		System.out.println("fu method_4");
	}
}

class Zi extends Fu
{
	int num = 8;
	void method1()
	{
		System.out.println("zi method_1");
	}
	void method3()
	{
		System.out.println("zi method_3");
	}
	static void method4()
	{
		System.out.println("zi method_4");
	}
}
class  DuotaiDemo4
{
	public static void main(String[] args) 
	{
//		Zi z = new Zi();
//		z.method1();
//		z.method2();
//		z.method3();


//		Fu f = new Zi();
//		System.out.println("f.num");

//		Zi z = new Zi();
//		System.out.println("z.num");
		//f.method1();
		//f.method2();
		//f.method3();
		
		Fu f = new Zi();
		f.method4();

		Zi z = new Zi();
		z.method4();

		/*
		�ڶ�̬�г�Ա�������ص�:
		�ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У�����ͨ�������û�б���ʧ��
		������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����
		���ܽ���ǣ���Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұ�

		�ڶ�̬�У���Ա�������ص�
		���۱�������У����ο���ߣ������ͱ����������ࣩ��

		�ڶ�̬�У���̬��Ա�������ص�:
		���۱�������У����ο����
		*/

		
	}
}