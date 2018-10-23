class Person
{
	private String name;
	private int age;
	private static String country = "CN";

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	{
		System.out.println(name+"::"+age);
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
		System.out.println("country = "+country);
	}
}
class PersonDemo 
{
	public static void main(String[] args) 
	{
		Person p = new Person("zhangsan",20);  // 结果是 null::0    因为name是private的，所以不能在person内以外改变，所以name就等于null，同理age也是如此
		p.setName("lisi");
	}
}

/*
Person p = new Person("zhangsan",20)
以上这句话做了什么事情

1.因为new用到了person.class 所以会先找到person.class文件并加载到类中
2.执行该类中的static代码块，如果有的话，给Person.class类进行初始化
3.在堆内存中开辟空间，分配内存地址
4.在堆内存中建立对象的特有属性,并进行默认初始化
5.对属性进行显示初始化
6.对对象进行改造代码块初始化
7.对对象进行对应的构造函数初始化
8.将内存赋值给栈内存中的p变量
*/
