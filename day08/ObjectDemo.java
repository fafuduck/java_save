/*
Object:�����ж����ֱ�Ӻ��߼�Ӹ��࣬��˵�е��ϵۡ�
�����ж���Ŀ϶������ж��󶼾߱��Ĺ���

Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ���

����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û�б�Ҫ���¶��塢
ֻҪ��Ϯ�����еĹ��ܣ������Լ����еıȽ����ݼ��ɣ�����Ǹ���
*/
class Demo // extends Object 
{
						/*
						Demo()
						{
							super(); // ���� Object()
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
