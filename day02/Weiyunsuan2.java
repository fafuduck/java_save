class Weiyunsuan2
{
	public static void main(String[] args)
	{
	//	System.out.println(Integer.toBinaryString(60));

		int num = 60;

		//获取60的最低4位，通过&15
		int n1 = num & 15; // = 12;

		System.out.println((char)(n1-10+'A'));

		//要获取下一组四位，将60右移4位
		int temp = 60 >> 4;

		//对temp的值进行最低四位的获取
		int n2 = temp & 15; // = 3;
		System.out.println(n2);

		int x = 3 , y;
		y = (x>1)?100:200;
		System.out.println("y="+y);
	}
}