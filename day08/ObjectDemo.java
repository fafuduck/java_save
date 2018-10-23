/*
Object:是所有对象的直接后者间接父类，传说中的上帝。
该类中定义的肯定是所有对象都具备的功能

Object类中已经提供了对对象是否相同的比较方法

如果自定义类中也有比较相同的功能，没有必要重新定义、
只要沿袭父类中的功能，建立自己特有的比较内容即可，这就是覆盖
*/
class Demo // extends Object 
{
						/*
						Demo()
						{
							super(); // 等于 Object()
						}
						*/

	private int num;
	Demo(int num)
	{
		this.num = num;
	}

	public boolean equals(Object obj) //Object obj = new Demo();
	{
		if(obj instanceof Demo)
			return false;

		Demo d = (Demo)obj;
		return this.num == d.num;
	}
	/*
	public boolean compare(Demo d)
	{
		return this.num = d.num;
	}
	*/
	public String toString()
	{
		return "demo":+num;
	}
}

/*
class Person
{
}
*/

class ObjectDemo 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(4);
		//Demo d2 = new Demo(6);

		
		System.out.println(d1.toStrng());
//		Class c = d1.getClass();

//		System.out.println(c.getName());
//		System.out.println(c.getName()+"@@"Integer.toHexString(d1.hashCode()));
//		System.out.println(d1.toString());


		//Person p = new Person();
		//System.out.println(d1.equals(p));
		//Demo d3 = d1;

	//	System.out.println(d1.compare(d2));
		//System.out.println(d1.equals(d2));
		//System.out.println(d1==d2);
		//System.out.println(d1==d3);

		/*
		Person p1 = new Person();
		Person p2 = new Person(); 

		System.out.println("person:"+p1.equals(p2));
		*/
	}
}
