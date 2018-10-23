class OtherDemo
{
	public static void main(String[] args)
	{

		//break : 可以用于循环和选择结构
		w:for(int x = 0; x<3; x++)
		{
			q:for(int y=0; y<4; y++)
			{
				System.out.println("x="+x);
				break w;
			}
		}

		//continue：只能作用与循环结构
		//继续循环，特点：结束本次循环，接去执行下次循环
		for(int x=1; x<3; x++)
		{
			if(x%2 == 1)
			   continue;	
			System.out.println("x="+x);	
		}
	}
}