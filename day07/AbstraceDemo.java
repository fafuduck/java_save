/*
��������г�����ͬ���ܣ����������岻ͬ
���ǿ��Խ������ϳ�ȡ����ʱ��ֻ��ȡ���ܶ��壬������ȡ��������

������ǿ�����

��������ص㣺
1.���󷽷�һ���ڳ�������
2.���󷽷��ͳ����඼���뱻abstract�ؼ�������
3.�����಻������new����������Ϊ���ó��󷽷�û���塣
4.�������еķ���Ҫ��ʹ�ã����������ิд�����еĳ��󷽷��󣬽�������������
	�������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ��������

�������һ����û��̫��Ĳ�ͬ
����ô�����������ô�������ֻ�����������������һЩ�������Ķ�����
��Щ��ȷ���Ĳ��֣�Ҳ�Ǹ�����Ĺ��ܣ���Ҫ��ȷ���֣������޷���������
ͨ�����󷽷���ʾ��

�������һ������˸��������� ���������п��Զ�����󷽷���
�����಻����ʵ������

���⣺�������п��Բ�������󷽷��������������ǲ��ø��ཨ������
*/
abstract class Student
{
	abstract void study(); //abstract -> ����
	void sleep()
	{
		System.out.println("����");
	}
}

class ChongciStudent extends Student
{
	void study()
	{
		System.out.println("chongci study");
	}
}

class BaseStudent extends Student
{
	void study()
	{
		System.out.println("base study");
	}
}
class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}
}
class  AbstraceDemo
{
	public static void main(String[] args) 
	{
		new BaseStudent
	}
}
