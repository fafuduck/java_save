/*
这个是先初始化对象。
称为：饿汉式

Single类一进内存，就已经创建好对象

class Single
{
	private static Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}
*/

//对象被调用时，才初始化，也叫做对象的延时加载，称为：懒汉式
//Single类进内存，对象还没有存在，只调用了getInstance方法时，才建立对象
class Single
{
	private static Single s = null;
	private Single(){}
	public static Single getInstance()
	{
		if(s==null)
		{
			synchronized(Single.class)
			{
				if(s=null)
				{
					s = new Single();
				}
			}
			return s;
	}
}

//记录原则：定义单例，建议使用饿汉式，
//面试经常考懒汉式
class SingleDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
