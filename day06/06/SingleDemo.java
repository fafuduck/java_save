/*
���ģʽ�����ĳһ����������֮��Ч�ķ���
java����23�����ģʽ:
�������ģʽ�����һ�������ڴ�ֻ����һ������

��Ҫ��֤����Ψһ��
1.Ϊ�˱�������������ཨ����������Ƚ�ֹ��������������
2.��Ϊ��������������Է��ʵ��������ֻ���ڱ����У��Զ���һ������
3.Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ��

��������ô�ô��������أ�
1.�����캯��˽�л���
2.�����д���һ���������
3.�ṩһ���������Ի�ȡ���ö���

�����������ô����������ô����
����Ҫ��������Ķ���֤���ڴ���Ψһʱ���ͽ����ϵ��������ϼ���

*/
class Single
{
	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}

	
	private single(){} //�����캯��˽�л�
	private static Single s = new Single();
	public static Single getInstace()
	{
		return s;
	}

}
class SingleDemo 
{
	public static void main(String[] args) 
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		s1.setNum(23);

		System.out.println(s2.getNum());
	}
}

class Student
{
	private int age;
	private Student s = new Student();
	public static Student getStudent()
	{
		return s;
	}

	public void setAge(int age)
	{
		return age;
	}

}
