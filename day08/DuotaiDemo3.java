/*
������ѧ��:
	ѧϰ��˯��
�߼���ѧ����
	ѧϰ��˯����

���Խ�������������г�ȡ
*/

class Student
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("����˯");
	}
}

class BaseStudent extends Student
{
	public void study()
	{
		System.out.println("base study");
	}
	public void sleep()
	{
		System.out.println("����˯");
	}
}

class AdvStudent extends Student
{
	public void study()
	{
		System.out.println("adv study");
	}
}

class DoStudent
{
	public void doSome(Student stu)
	{
		stu.study();
		stu.sleep();
	}
}

class  DuotaiDemo3
{
	public static void main(String[] args) 
	{
		/*
		BaseStudent bs = new BaseStudent();
		bs.study();
		bs.sleep();
		AdvStudent as = new AdvStudent();
		as.study();
		as.sleep();
		*/
		DoStudent ds = new DoStudent();
		ds.doSome(new BaseStudent());
		ds.doSome(new AdvStudent());


	}

	
}