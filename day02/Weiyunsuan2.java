class Weiyunsuan2
{
	public static void main(String[] args)
	{
	//	System.out.println(Integer.toBinaryString(60));

		int num = 60;

		//��ȡ60�����4λ��ͨ��&15
		int n1 = num & 15; // = 12;

		System.out.println((char)(n1-10+'A'));

		//Ҫ��ȡ��һ����λ����60����4λ
		int temp = 60 >> 4;

		//��temp��ֵ���������λ�Ļ�ȡ
		int n2 = temp & 15; // = 3;
		System.out.println(n2);

		int x = 3 , y;
		y = (x>1)?100:200;
		System.out.println("y="+y);
	}
}