class  MainDemo 
{
	public static void main(String[] args)   // new String []
	{
		String[] arr = {"hah","hehe","xixi","hiahia"};

		MainTest.main(arr);  //调用下面的class MainTest


		

	}
}

class MainTest
{
	public static void main(String[] args)
	{
		for(int x=0; x<args.length; x++)
			System.out.println(args[x]);
	}
}


/*
MainDemo.java讲的是public static void main(String[] args)的原理
其实在public static void main(String[] args)出现的时候就是 创建了一个new String[]
*/