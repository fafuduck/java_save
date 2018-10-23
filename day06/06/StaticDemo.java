class Person
{
	String name; 
	static String country = "CN";
	public void show()
	{
		System.out.println(name+"::"+country);
	}
}
class StaticDemo 
{
	public static void main(String[] args) 
	{
		Person p =new Person();
		//p.name = "zhangsan";
		//p.show();

		System.out.println(p.country);

	}
}
