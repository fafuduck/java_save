
/*
���������ڿ���һ��ϵͳʱ��Ҫ��Ա�����н�ģ��Ա������3�����ԣ�
�����������Լ����ʡ�����Ҳ��Ա�������˺���Ա���������⣬���⻹��һ��
�������ԡ���ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ��
�����������Է���

Ա���ࣺ name id pay

�����ࣺ �̳���Ա���������Լ����е�bonus��
*/
abstract class Employee  //Ա����
{
	private String name;
	private String id;
	private double pay;

	Employee(String name, String id, double pay)
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	
	public abstract void work();  // ÿ��Ա����Ҫ�߱��Ĺ�������
}

class Manager extends Employee // ����̳���Ա�������� ���������bonus����
{
	private int bonus;
	Manager(String name, String id, double pay, int bonus)
	{
		super(name,id,pay);
		this.bonus = bonus;
	}

	public void work()
	{
		System.out.println("manager work");
	}

}


class  AbstractTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
