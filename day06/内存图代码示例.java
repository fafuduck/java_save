class Person
{
	private String name;
	private int age;
	private static String country = "cn";
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	{
		System.out.println(name+".."+age);
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public void speak()
	{
		System.out.println(this.name+".."+this.age);
	}

	public static void showCountry()
	{
		System.out.println("country="country);
	}

}
class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person("zhangsan",20);
		p.setName("Lisi");
	}
}

/*
Person p = new Person("zhangsan",20);

��仰����ʲô����
1.��Ϊnew�õ���Person.class ���Ի����ҵ�Person.class�ļ������ص��ڴ���
2.ִ�и����е�static����飬����еĻ�����Person.class����г�ʼ��
3.�ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ��
4.�ڶ��ڴ��н���������������ԡ�������Ĭ�ϳ�ʼ��
5.�����Խ�����ʾ��ʼ��
6.�Զ�����и��������ʼ����
7.�Զ�����ж�Ӧ�Ĺ��캯����ʼ��
8.���ڴ��ַ����ջ�ڴ���p����
*/