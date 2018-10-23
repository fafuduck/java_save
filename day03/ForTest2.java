/*
1.获取1~10的和，并打印
2.1~100之间7的倍数的个数。并打印
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