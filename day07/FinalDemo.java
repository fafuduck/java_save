/*
final:���գ� ��Ϊһ�����η�
1.���������ࡢ������������
2.��final���ε��಻���Ա��̳С�Ϊ�˱��ⱻ�̳У������ิд����
3.��final���εķ��������Ա���д
4.��final���εı�����һ������ֻ�ܸ�ֵһ�Σ��ȿ������γ�Ա�������ֿ������ξֲ�����
	������������ʱ��һЩ���ݵĳ���ֵ�ǹ̶��ģ���ô��ʱΪ����ǿ�Ķ��ԣ�������Щֵ������֣��������Ķ�
	�����ֵ����Ҫ�ı䣬�ͼ�final����.��Ϊ��������������д�淶������ĸ����д������ɶ��������ɣ�
	���ʼ�ͨ��_����
5.�ڲ��ඨ�������еľֲ�λ����ʱ��ֻ�ܷ��ʸþֲ���final���εľֲ�����
*/
class Demo
{
	final int x = 3;
	public static final double PI = 3.14;
	final void show1()
	{
	}
	void show2()
	{
		final int y = 4;
	}
}
class SubDemo extends Demo
{
	//void show1(){}
}
class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
