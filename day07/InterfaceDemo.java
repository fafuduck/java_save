/*
�ӿڣ�������⣬������Ϊ��һ������ĳ�����
	���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ
class ���ڶ�����
interface���ڶ���ӿ�

�ӿڶ���ʱ����ʽ�ص㣺
1.�ӿ��г������壺���������󷽷�
2.�ӿ��еĳ�Ա���й̶������η�
	������public static final
	������public abstract	

�ӿ��еĳ�Ա����public��

�ӿ��ǲ����Դ�������ģ���Ϊ�г��󷽷���
��Ҫ������ʵϰ���������ӿ��еĳ��󷽷�ȫ�����Ǻ�����ſ���ʵ������
����������һ��������

�ӿڿ��Ա����ʵ�֡�Ҳ�ǶԶ�̳в�֧��ת����ʽ��java֧�ֶ�ʵ��

*/
interface Inter
{
	public static final int NUM = 3;
	public abstract void show();
}
interface InterA
{
	public abstract void show();
}
class Test implements Inter  //�൱�ڼ̳�extends ��implements�ǽӿ��õ� ��ʵ��
{
	public void show(){}
}

class Demo
{
	public void function(){}
}

class Test extends Demo implements Inter,InterA
{
	public void show(){}
}

interface A
{
	void  methodA();
}
interface B extends A
{
	void  methodB();
}
interface c extends B
{
	void  methodC();
}
class D implements c
{
	public void methodA(){}
	public void methodC(){}
	public void methodB(){}
}

class InterfaceDemo
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);
	}
}

/*
abstract class Demo
{
	abstract void show();
}
*/