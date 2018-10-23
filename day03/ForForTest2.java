class ForForTest2  
{
	public static void main(String[] args)
	{
		for(int x=0; x<6; x++)  // 定义行数为5行
		{
			for(int y=0; y<5; y++)  
			{
				if(y<5-x)  
				{
				  System.out.print(" ");
				}
				else
				{
				  System.out.print("* ");	
				}	
			}	
			System.out.println();
		}
	}
}

/*

该程序就是展示以下图形
    *
   * *
  * * *
 * * * *
* * * * *

*/