class FuzhiDemo  //关于赋值
{
	public static void main(String[] args)
	{
		int x = 3;
		// +=  -= *= /= %=

		x+=4; // x = x + 4;

		short s = 4;

//		s = s + 5;// 的二进制数是int   数值会溢出

		s+=5;  //会进行自动转换  只做赋值运算

/*

面试题：
s = s + 5 和 s+=5的区别
前者会0100+00000101会计算，然后给s赋值会溢出

后者只进行赋值

*/

		int a,b,c;
		a = b = c = 5;

		System.out.println(3>4);  //会输出结果false 若正确就是true
  

	}
}