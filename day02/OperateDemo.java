class OperateDemo
{
	public static void main(String[] args)
	{
	//	int x = 4320;
	//	x = x / 1000 * 1000;
	//	System.out.println(x);

		int a = 3,b;

		b = a++;

//		System.out.println(b);
//		System.out.println(a);

		//字符串数据和任何数据使用+都是相连接，最终都会变成字符串
	//	System.out.println("hahahaha"+"shabi");
	//	System.out.println("ab"+5+5); // "ab5"+5 "ab55"

		System.out.println("a="+a); // 显示a=3


/*
转义字符：通过\ 来转变后面字母或者符号的含义。
\n:换行。
\b:退格  相当于backspace键
\r:按下回车键   windows系统，回车符是由两个字符来表示\r\n
\t:制表符  相当于tab键
println的ln就是换行的意思

*/

		System.out.println("hello \n world");
		System.out.println("\"hello\"");// 带双引号的hello，转义字符写在前面

	}
}