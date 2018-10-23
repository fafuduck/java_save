class SwitchDemo
{
	public static void main(String[] args)
	{
		//需求设计一个3层楼的电梯程序
		int x = 1;
		
		switch(x)
		{
			case 1:
			{
				System.out.println("一楼到了");
				break;
			}
			case 2:
			{
				System.out.println("二楼到了");
				break;
			}
			case 3:
			{
				System.out.println("三楼到了");
				break;
			}
			default:
			{
				System.out.println("该楼层不存在");
			}
		}
	}
}