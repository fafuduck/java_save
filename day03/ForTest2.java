/*
1.��ȡ1~10�ĺͣ�����ӡ
2.1~100֮��7�ı����ĸ���������ӡ
*/

class ForTest2
{


	public static void main(String[] args)
	{
	/*
		int sum = 0;
		for(int i = 1; i<=10; i++)
		{
			sum = sum + i;
		}
		System.out.println("sum="+sum);
	
	*/

	

		int cnt = 0;
		
		for(int i=1; i<=100; i++)
		{
			if(i%7==0)
			{
				cnt++;
			}
			
			
		}
		System.out.println("cnt="+cnt);
	}
}