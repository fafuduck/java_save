class Person
{
	private int age;  //�����������

	public void setAge(int a)
	{
		if(a>0 && a<130)
		{
			age = a;
			speak();
		}
		else
		{
			System.out.println("�Ƿ���������");
		}
	}

	public int getAge()
	{
		return age;
	}

	void speak()
	{
		System.out.println("age = " +age);
	}
}

class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.age = 30; 
		p.setAge(20);
	}
}